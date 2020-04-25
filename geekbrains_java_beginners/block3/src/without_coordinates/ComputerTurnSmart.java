package without_coordinates;

import java.util.Random;

import static without_coordinates.computer.logic.ComputerHelpers.*;
import static without_coordinates.EndGame.isCellValid;
import static without_coordinates.Main.SIZE;
import static without_coordinates.Main.map;
import static without_coordinates.Main.DOT_O;
import static without_coordinates.computer.logic.SureWin.findWinningColumn;
import static without_coordinates.computer.logic.UrgentMove.findUrgentCell;

class ComputerTurnSmart {

    static int [] computerTurnSmart() {
        if (isCenterEmpty()) {
            map[SIZE / 2][SIZE / 2] = DOT_O;
            return new int[]{SIZE / 2, SIZE / 2};
        }
        int [] urgentCell = findUrgentCell();
        if (urgentCell[0] != SIZE){
            map[urgentCell[0]][urgentCell[1]]= DOT_O;
            return urgentCell;
        }

        Random random = new Random();


        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x,y));

        map[x][y] = DOT_O;
        return new int[]{x, y};


    }
}
