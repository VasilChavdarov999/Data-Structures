import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        int mainDiagonal = getMainDiagonalSum(matrix);
        int secondaryDiagonal = getsecondaryDiagonal(matrix);
        System.out.println(Math.abs(mainDiagonal - secondaryDiagonal));

    }

    private static int getsecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[row].length){
            sum += matrix[row][col];
            row--;
            col++;
        }

        return sum;
    }

    private static int getMainDiagonalSum(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < matrix.length && col < matrix[row].length){
            sum += matrix[row][col];
            row++;
            col++;
        }
        return sum;
    }
}
