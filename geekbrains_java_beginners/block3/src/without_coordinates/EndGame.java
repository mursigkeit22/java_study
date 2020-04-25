package without_coordinates;

import static without_coordinates.Main.DOT_EMPTY;
import static without_coordinates.Main.SIZE;
import static without_coordinates.Main.map;
import static without_coordinates.MapMethods.printMap;
import static without_coordinates.Win.checkWin;

public class EndGame {
     static boolean isEndGame(char playerSymbol) {
         printMap();
         if (checkWin(playerSymbol)) {
             System.out.println( "The winner is " + playerSymbol);
             return true;
         }
         if (isMapFull()) {
             System.out.println("Draw!");
             return true;
         }
         return false;
     }


     static boolean isMapFull(){
         for (int i = 0; i < SIZE; i++){
             for (int j = 0; j < SIZE; j++){
                 if (map[i][j] == DOT_EMPTY) {return false;}
             }
         }
         return true;
     }

    static boolean isCellValid(int x, int y){
        if (x<0 || x >= SIZE || y < 0 || y >= SIZE) {return false;}
        return map[x][y] == DOT_EMPTY;
    }
}
