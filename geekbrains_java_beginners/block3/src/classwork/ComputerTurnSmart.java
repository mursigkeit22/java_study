package classwork;

import java.util.Random;

import static classwork.computer.logic.ComputerHelpers.*;
import static classwork.EndGame.isCellValid;
import static classwork.Main.SIZE;
import static classwork.Main.map;
import static classwork.Main.DOT_O;
import static classwork.computer.logic.SureWin.findWinningColumn;
import static classwork.computer.logic.UrgentMove.findUrgentCell;

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

//        int[] winCell = findWinningRow();


//        if (winCell[0] != SIZE) {
//            map[winCell[0]][winCell[1]]= DOT_O;
//            return winCell;
//        }

//        int[] winCell1 = findWinningColumn();
//        if (winCell1[0] != SIZE) {
//            map[winCell1[0]][winCell1[1]]= DOT_O;
//            return winCell1;
//        }




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
