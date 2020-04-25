package classwork;
import static classwork.Main.map;
import static classwork.Main.SIZE;
import static classwork.Main.DOT_EMPTY;


public class MapMethods {


    static char[][] initMap() {
        char[][] map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
        return map;
    }

    static void printMap() {
        System.out.print(" ");

        for (int i = 1; i <= map.length; i++){
            System.out.print(" ");
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++){
            System.out.print((i+1)+" ");
            for (int j = 0; j < map.length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
