import java.util.Scanner;

public class IntersectionOfTwoMatrices2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

       char[][] firstMatrix = readMatrix(rows, cols, scanner);
       char[][] secondMatrix = readMatrix(rows,cols, scanner);

        compareMethod(firstMatrix, secondMatrix);
    }

    private static void compareMethod(char[][] firstMatrix, char[][] secondMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]){
                    System.out.print(firstMatrix[row][col] + " ");
                }else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            char[] arr = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[j];
            }
        }
        return matrix;
    }
}
