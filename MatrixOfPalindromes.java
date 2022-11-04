import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
               .mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];

        readMatrix(rows, cols);
        printMatrix(readMatrix(rows, cols));


    }

    private static void printMatrix(String[][] readFakenMatrix) {
        for (int row = 0; row < readFakenMatrix.length; row++) {
            for (int col = 0; col < readFakenMatrix[row].length; col++) {
                System.out.print(readFakenMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char outside = (char) ('a' + row);
                char middle = (char) (outside + col);
                matrix[row][col] = String.valueOf(outside) + middle + outside;
            }
        }
        return matrix;
    }
}
