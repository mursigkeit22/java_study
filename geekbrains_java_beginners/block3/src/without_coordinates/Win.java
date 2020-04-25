package without_coordinates;

import static without_coordinates.Main.SIZE;
import static without_coordinates.Main.map;


public class Win {
    static boolean checkWin(char playerSymbol) {

        return checkDiagonals(playerSymbol) || checkLines(playerSymbol);
    }

    static boolean checkDiagonals(char playerSymbol) {
        boolean firstDiagonal, secondDiagonal;
        firstDiagonal = true;
        secondDiagonal = true;

        for (int i = 0; i < SIZE; i++) {
            firstDiagonal &= (map[i][i] == playerSymbol);
            secondDiagonal &= (map[i][SIZE - i - 1] == playerSymbol);
        }
        return (firstDiagonal || secondDiagonal);
    }

    static boolean checkLines(char playerSymbol) {
        boolean vertical, horizontal;

        for (int i = 0; i < SIZE; i++) {
            vertical = true;
            horizontal = true;
            for (int j = 0; j < SIZE; j++) {

                vertical &= (map[j][i] == playerSymbol);
                horizontal &= (map[i][j] == playerSymbol);

            }
            if (vertical||horizontal){return true;}
        }
//        System.out.println("vertical: " + vertical);
//        System.out.println("horizontal: " + horizontal);

        return false;
    }


}
