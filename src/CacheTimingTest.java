import java.util.Random;

public class CacheTimingTest {

    public static void main(String[] args) {
        int[] sizes = {2, 4, 5, 10, 100, 1000, 10000};
        Random rand = new Random();

        for (int size : sizes) {
            int[][] array = new int[size][size];

           
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = rand.nextInt(100);
                }
            }

            long startRow = System.nanoTime();
            long sumRow = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    sumRow += array[i][j];
                }
            }
            long endRow = System.nanoTime();
            long rowTime = endRow - startRow;

           
            long startCol = System.nanoTime();
            long sumCol = 0;
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    sumCol += array[i][j];
                }
            }
            long endCol = System.nanoTime();
            long colTime = endCol - startCol;

           
            System.out.printf("Array size: %dx%d\n", size, size);
            System.out.printf("Row-major time: %d ns\n", rowTime);
            System.out.printf("Column-major time: %d ns\n", colTime);
            System.out.println();
        }
    }
}
