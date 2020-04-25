package classwork.computer.logic;

import static classwork.Main.*;
import static classwork.computer.logic.ComputerHelpers.*;
import static classwork.computer.logic.ComputerHelpers.checkRightDiagonal;

public class BlockEnemy {
    public static int[] findLoosingRow() {
        int[] arr = {SIZE, SIZE};
        for (int i = 0; i < SIZE; i++) {
            int j = checkRow(i, DOT_O);

            if (j < SIZE) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
        }
        return arr;
    }

    public static int[] findLoosingColumn() {
        int[] arr = {SIZE, SIZE};
        for (int j = 0; j < SIZE; j++) {
            int i = checkColumn(j, DOT_O );

            if (i < SIZE) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
        }
        return arr;
    }

    public static int[] findLoosingDiagonal(){
        int[] arr = {SIZE, SIZE};

        int[] winCellLeft = checkLeftDiagonal(DOT_O);
        if (winCellLeft[0] != SIZE){ return winCellLeft;}

        int[] winCellRight = checkRightDiagonal(DOT_O);
        if (winCellRight[0] != SIZE){ return winCellRight;}

        return  arr;

    }
}
