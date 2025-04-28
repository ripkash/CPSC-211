import java.util.concurrent.*;
import java.util.*;

public class ArraySummer {

    public static long sequentialSum(int[] array) {
        long sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum;
    }

    public static long parallelSum(int[] array, int threadCount) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        int chunkSize = (int) Math.ceil(array.length / (double) threadCount);
        List<Future<Long>> futures = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);

            futures.add(executor.submit(() -> {
                long partSum = 0;
                for (int j = start; j < end; j++) {
                    partSum += array[j];
                }
                return partSum;
            }));
        }

        long total = 0;
        for (Future<Long> f : futures) {
            total += f.get();
        }

        executor.shutdown();
        return total;
    }
}
