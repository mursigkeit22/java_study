package classwork;

import static classwork.ComputerTurnRandom.computerTurnRandom;
import static classwork.ComputerTurnSmart.computerTurnSmart;
import static classwork.EndGame.isEndGame;
import static classwork.MapMethods.initMap;
import static classwork.MapMethods.printMap;
import static classwork.HumanTurn.humanTurn;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '▢';
    public static final char DOT_X = '☒';
    public static final char DOT_O = '⊚';
    public static String MODE = "SMART";

    public static void main(String[] args) {
        map = initMap();
        printMap();

        while (true) {
            int[] humanCoordinates = humanTurn();
            if (isEndGame(DOT_X, humanCoordinates)) {
                break;
            }
            int[] compCoordinates;
            if (MODE.equals("GEEKBRAINS")) {
                compCoordinates = computerTurnSmart();
            }
            if (MODE.equals("RANDOM")) {
                compCoordinates = computerTurnRandom();
            }
            else {
                compCoordinates = computerTurnSmart();
            }


            if (isEndGame(DOT_O, compCoordinates)) {
                break;
            }


        }
    }
}