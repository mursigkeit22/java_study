package without_coordinates.computer.logic;

import static without_coordinates.Main.*;
import static without_coordinates.computer.logic.ComputerHelpers.*;


public class SureWin {

    public static int[] findWinningRow() {
        int[] arr = {SIZE, SIZE};
        for (int i = 0; i < SIZE; i++) {
            int j = checkRow(i, DOT_X );

            if (j < SIZE) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
        }
        return arr;
    }

    public static int[] findWinningColumn() {
        int[] arr = {SIZE, SIZE};
        for (int j = 0; j < SIZE; j++) {
            int i = checkColumn(j, DOT_X );
            if (i < SIZE) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
        }
        return arr;
    }
    public static int[] findWinningDiagonal(){
        int[] arr = {SIZE, SIZE};

        int[] winCellLeft = checkLeftDiagonal(DOT_X);
        if (winCellLeft[0] != SIZE){ return winCellLeft;}

        int[] winCellRight = checkRightDiagonal(DOT_X);
        if (winCellRight[0] != SIZE){ return winCellRight;}

        return  arr;

    }

}
