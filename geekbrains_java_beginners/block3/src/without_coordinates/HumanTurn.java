package without_coordinates;

import java.util.Scanner;

import static without_coordinates.EndGame.isCellValid;
import static without_coordinates.Main.SIZE;
import static without_coordinates.Main.DOT_EMPTY;
import static without_coordinates.Main.map;
import static without_coordinates.Main.DOT_X;

class HumanTurn {

    private static Scanner scanner = new Scanner(System.in);

    static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter cell coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x,y));

        map[x][y] = DOT_X;


    }



}
