import java.util.HashMap;
import java.util.Map;

public class MultithreadingLab {
    public static void main(String[] args) throws Exception {
        int[] N_VALUES = {10, 100, 1000, 10000};
        int[] THREAD_COUNTS = {1, 2, 4, 10};

        for (int n : N_VALUES) {
            int[] array = RandomArrayGenerator.generate(n);

            double maxTime = 0;
            Map<Integer, Double> timeResults = new HashMap<>();

            System.out.println("Array Size: " + n);

            for (int threads : THREAD_COUNTS) {
                long start = System.nanoTime();

                long sum = (threads == 1)
                        ? ArraySummer.sequentialSum(array)
                        : ArraySummer.parallelSum(array, threads);

                long end = System.nanoTime();
                double duration = (end - start) / 1_000_000.0;
                timeResults.put(threads, duration);
                if (duration > maxTime) maxTime = duration;

                System.out.printf("Threads: %d | Sum: %d | Time: %.3f ms%n", threads, sum, duration);
            }

           
            System.out.println("Efficiency:");
            for (int threads : THREAD_COUNTS) {
                double efficiency = maxTime / timeResults.get(threads);
                System.out.printf("Threads: %d | Efficiency: %.2f%n", threads, efficiency);
            }

            System.out.println("-------------------------------------------------");
        }
    }
}
