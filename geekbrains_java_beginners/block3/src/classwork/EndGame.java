package classwork;

import static classwork.Main.DOT_EMPTY;
import static classwork.Main.SIZE;
import static classwork.Main.map;
import static classwork.MapMethods.printMap;
import static classwork.Win.checkWin;

public class EndGame {
     static boolean isEndGame(char playerSymbol, int [] coordinates) {
         printMap();
         if (checkWin(playerSymbol, coordinates)) {
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
