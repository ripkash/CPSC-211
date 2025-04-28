import java.util.Random;
import java.util.stream.IntStream;

public class RandomArrayGenerator {
    private static final int MAX_RANDOM = 100;

    public static int[] generate(int size) {
        Random rand = new Random();
        return IntStream.range(0, size)
                        .map(i -> rand.nextInt(MAX_RANDOM) + 1)
                        .toArray();
    }
}
