import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < sizeOfMatrix; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        int row = sizeOfMatrix - 1;
        int col = 0;

        while (isInBounds(row, col, matrix)){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }


    }

    private static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
//    private static boolean isOutOfBounds(int row, int col, int[][] matrix) {
//        return !isInBounds(row,col,matrix);
//    }
}
