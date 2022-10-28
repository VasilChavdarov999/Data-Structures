import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, scanner);
        int searchingNumber = Integer.parseInt(scanner.nextLine());

        iterateMatrixMethod(matrix, searchingNumber);

    }

    private static boolean iterateMatrixMethod(int[][] matrix, int searchingNumber) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchingNumber){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
        return false;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < arr.length; col++) {
                matrix[row][col] = arr[col];
            }
        }
        return matrix;
    }
}
