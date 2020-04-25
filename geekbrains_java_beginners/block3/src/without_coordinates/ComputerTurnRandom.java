package without_coordinates;
import java.util.Random;

import static without_coordinates.EndGame.isCellValid;
import static without_coordinates.Main.SIZE;
import static without_coordinates.Main.DOT_EMPTY;
import static without_coordinates.Main.map;
import static without_coordinates.Main.DOT_O;

public class ComputerTurnRandom {
    static Random random = new Random();
    static void computerTurnRandom() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x,y));

        map[x][y] = DOT_O;



    }
}
