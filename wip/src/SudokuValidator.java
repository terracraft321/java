import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public static void main(String[] args) {
        char[][] validSudoku = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] invalidSudoku = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Valid Sudoku: " + isValidSudoku(validSudoku));
        System.out.println("Invalid Sudoku: " + isValidSudoku(invalidSudoku));
    }

    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidSet(board[i])) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            char[] column = new char[9];
            for (int i = 0; i < 9; i++) {
                column[i] = board[i][j];
            }
            if (!isValidSet(column)) {
                return false;
            }
        }

        // Check subgrids
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                char[] subgrid = new char[9];
                int index = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        subgrid[index++] = board[k][l];
                    }
                }
                if (!isValidSet(subgrid)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidSet(char[] array) {
        Set<Character> set = new HashSet<>();
        for (char c : array) {
            if (c != '.' && !set.add(c)) {
                return false; // Duplicate found
            }
        }
        return true;
    }
}
