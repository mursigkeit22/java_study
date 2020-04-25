package without_coordinates;

import static without_coordinates.ComputerTurnRandom.computerTurnRandom;
import static without_coordinates.ComputerTurnSmart.computerTurnSmart;
import static without_coordinates.EndGame.isEndGame;
import static without_coordinates.MapMethods.initMap;
import static without_coordinates.MapMethods.printMap;
import static without_coordinates.HumanTurn.humanTurn;

public class Main {
    public static char[][] map;
    public static final int SIZE = 4;
    public static final char DOT_EMPTY = '▢';
    public static final char DOT_X = '☒';
    public static final char DOT_O = '⊚';
    public static String MODE = "SMART";

    public static void main(String[] args) {
        map = initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(DOT_X)) {
                break;
            }
            if (MODE.equals("GEEKBRAINS")) {
                computerTurnSmart();
            }
            if (MODE.equals("RANDOM")) {
                computerTurnRandom();
            }
            else {
                computerTurnSmart();
            }


            if (isEndGame(DOT_O)) {
                break;
            }


        }
    }
}