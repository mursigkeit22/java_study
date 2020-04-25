package without_coordinates.computer.logic;

import static without_coordinates.Main.*;

public class ComputerHelpers {
    public static boolean isCenterEmpty() {
        if (SIZE % 2 == 0) {
            return false;
        }
        return map[SIZE / 2][SIZE / 2] == DOT_EMPTY;

    }

    public static boolean isCellDiagonal(int x, int y) {
        return (x == y) || y == SIZE - x - 1;

    }


    public static int checkRow(int rowNumber, char dot) {
        int flag = 0;
        int winCell = SIZE;
        for (int j = 0; j < SIZE; j++) {
            if (map[rowNumber][j] == dot) {
                return SIZE;
            }
            if (map[rowNumber][j] == DOT_EMPTY) {
                flag++;
                winCell = j;
            }
            if (flag > 1) {
                return SIZE;
            }
        }
        return winCell;
    }

    public static int checkColumn(int columnNumber, char dot) {
        int emptyCounter = 0;
        int winCell = SIZE;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][columnNumber] == dot) {
                return SIZE;
            }
            if (map[i][columnNumber] == DOT_EMPTY) {
                emptyCounter++;
                winCell = i;
            }
            if (emptyCounter > 1) {
                return SIZE;
            }
        }
        return winCell;
    }

    public static int[] checkLeftDiagonal(char dot) {
        int flag = 0;
        int[] arr = {SIZE, SIZE};
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                return new int[]{SIZE, SIZE};
            }
            if (map[i][i] == DOT_EMPTY) {
                arr[0] = i;
                arr[1] = i;
                flag++;
            }
            if (flag > 1) {
                return new int[]{SIZE, SIZE};
            }
        }
        return arr;
    }

    public static int[] checkRightDiagonal(char dot) {
        int flag = 0;
        int[] arr = {SIZE, SIZE};
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - i - 1] == dot) {
                return new int[]{SIZE, SIZE};
            }
            if (map[i][SIZE - i - 1] == DOT_EMPTY) {
                arr[0] = i;
                arr[1] = SIZE - i - 1;
                flag++;
            }
            if (flag > 1) {
                return new int[]{SIZE, SIZE};
            }
        }
        return arr;
    }
}
