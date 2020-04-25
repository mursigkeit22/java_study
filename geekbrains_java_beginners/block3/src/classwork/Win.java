package classwork;
import static classwork.Main.SIZE;
import static classwork.Main.map;


public class Win {
    static boolean checkWin(char playerSymbol, int [] coordinates) {
        return checkDiagonals(playerSymbol) || checkLines(playerSymbol, coordinates);
    }

    static boolean checkDiagonals (char playerSymbol){
        boolean firstDiagonal, secondDiagonal;
        firstDiagonal= true;
        secondDiagonal = true;

        for (int i = 0; i < SIZE; i++){
            firstDiagonal &= (map[i][i] == playerSymbol);
            secondDiagonal &= (map[i][SIZE - i - 1] == playerSymbol);
        }
        return (firstDiagonal||secondDiagonal);
    }



    static boolean checkLines(char playerSymbol, int [] coordinates) {
        boolean result1 = true;
        boolean result2 = true;
        int x = coordinates[0];
        int y = coordinates[1];

        for (int i = 0; i < SIZE; i++) {
            if (map[x][i] != playerSymbol) {
                result1 = false;
                break;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (map[i][y] != playerSymbol) {
                result2 = false;
                break;
            }
        }

        return result1 || result2;

    }

}
