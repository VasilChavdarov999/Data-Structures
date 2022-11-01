
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 8;
        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                board[i][j] = line[j].charAt(0);
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == 'q'){
                    boolean isColValid = checkQueenCol(board, col);
                    boolean isRowValid = checkQueenRow(board, row);
                    boolean isMainDiagonalValidUpLeft = checkMainDiagonalUpLeft(board, row, col);
                    boolean isMainDiagonalValidDownRight = checkMainDiagonalDownRight(board, row, col);
                    boolean isSecondaryDiagonalValidUpRight = checkSecondaryDiagonalUpRight(board,row, col);
                    boolean isSecondaryDiagonalValidDownLeft = checkSecondaryDiagonalDownLeft(board, row, col);

                    if (isColValid && isRowValid && isMainDiagonalValidUpLeft && isMainDiagonalValidDownRight
                            && isSecondaryDiagonalValidDownLeft && isSecondaryDiagonalValidUpRight){
                        System.out.println(row + " " + col);
                        return;
                    }
                }
            }
        }
    }

    private static boolean checkSecondaryDiagonalDownLeft(char[][] board, int row, int col) {
        row++;
        col--;
        while (row < 8 && col >= 0){
            if (board[row++][col--] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkSecondaryDiagonalUpRight(char[][] board, int row, int col) {
        row--;
        col++;
        while (row >= 0 && col < 8){
            if (board[row--][col++] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkMainDiagonalDownRight(char[][] board, int row, int col) {
        row++;
        col++;
        while (row < 8 && col < 8){
            if (board[row++][col++] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkMainDiagonalUpLeft(char[][] board, int row, int col) {
        row--;
        col--;
        while (row >= 0 && col >= 0){
            if (board[row--][col--] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenRow(char[][] board, int row) {
        int queen = 0;
        for (int i = 0; i < board.length; i++) {
            char symbol = board[row][i];
            if (symbol == 'q'){
                queen++;
            }
        }
        return queen == 1;
    }

    private static boolean checkQueenCol(char[][] board, int col) {
        int queens = 0;
        for (int i = 0; i < board.length; i++) {
            char symbol = board[i][col];
            if (symbol == 'q'){
                queens++;
            }
        }
        return queens == 1;
    }
}
