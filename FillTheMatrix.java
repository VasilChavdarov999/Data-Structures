import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        switch (tokens[1]){
            case "A":
                fillMatrixVariantA(tokens[0]);
                printMatrix(fillMatrixVariantA(tokens[0]));
                break;
            case "B":
                fillMatrixVariantB(tokens[0]);
                printMatrix(fillMatrixVariantB(tokens[0]));
                break;
        }
    }

    private static int[][] fillMatrixVariantB(String token) {
        int[][]matrix = new int[Integer.parseInt(token)][Integer.parseInt(token)];
        
        int value = 1;

        for (int col = 0; col < Integer.parseInt(token); col++) {
            if (col % 2 == 0){
                for (int row = 0; row < Integer.parseInt(token); row++) {
                    matrix[row][col] = value++;
                }
            }else {
                for (int row = Integer.parseInt(token) - 1; row >= 0; row--) {
                    matrix[row][col] = value++;
                }
            }
        }
        return  matrix;
    }

    private static void printMatrix(int[][] fillMatrix) {
        for (int row = 0; row < fillMatrix.length; row++) {
            for (int col = 0; col < fillMatrix[row].length; col++) {
                System.out.print(fillMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixVariantA(String token) {
        int[][] matrix = new int[Integer.parseInt(token)][Integer.parseInt(token)];

        int value = 1;
        for (int col = 0; col < Integer.parseInt(token); col++) {
            for (int row = 0; row < Integer.parseInt(token); row++) {
                matrix[row][col] = value++;
            }
        }
        return matrix;
    }
}
