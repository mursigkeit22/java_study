package classwork;
import java.util.Random;

import static classwork.EndGame.isCellValid;
import static classwork.Main.SIZE;
import static classwork.Main.DOT_EMPTY;
import static classwork.Main.map;
import static classwork.Main.DOT_O;

public class ComputerTurnRandom {
    static Random random = new Random();
    static int [] computerTurnRandom() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x,y));

        map[x][y] = DOT_O;
        return new int[]{x, y};


    }
}
