package classwork;

import java.util.Scanner;

import static classwork.EndGame.isCellValid;
import static classwork.Main.SIZE;
import static classwork.Main.DOT_EMPTY;
import static classwork.Main.map;
import static classwork.Main.DOT_X;

class HumanTurn {

    private static Scanner scanner = new Scanner(System.in);

    static int [] humanTurn() {
        int x, y;
        do {
            System.out.println("Enter cell coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x,y));

        map[x][y] = DOT_X;
        return new int[]{x, y};


    }



}
