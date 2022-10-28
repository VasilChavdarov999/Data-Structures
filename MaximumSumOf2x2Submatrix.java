import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, scanner);
        int maxSum = Integer.MIN_VALUE;

        int[][] resultMatrix = new int[2][2];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentSum = matrix[i][j]
                        + matrix[i + 1][j]
                        + matrix[i][j + 1]
                        + matrix[i + 1][j + 1];

                if (maxSum < currentSum){
                    maxSum = currentSum;
                    resultMatrix = new int[][]{
                            {matrix[i][j] ,matrix[i][j + 1]},
                            {matrix[i + 1][j], matrix[i +1][j + 1]}
                    };
                }
            }
        }
        for (int[] ints : resultMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < arr.length; col++) {
                matrix[row][col] = arr[col];
            }
        }
        return matrix;
    }
}
