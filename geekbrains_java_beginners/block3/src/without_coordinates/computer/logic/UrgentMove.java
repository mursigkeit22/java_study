package without_coordinates.computer.logic;

import static without_coordinates.Main.*;
import static without_coordinates.computer.logic.BlockEnemy.*;
import static without_coordinates.computer.logic.SureWin.*;

public class UrgentMove {
    public static int[] findUrgentCell(){
        int[] urgentCell1 = findWinningRow();
        if (urgentCell1[0] != SIZE) {
            return urgentCell1;
        }
        int[] urgentCell2 = findWinningColumn();
        if (urgentCell2[0] != SIZE) {
            return urgentCell2;
        }
        int[] urgentCell5 = findWinningDiagonal();
        if (urgentCell5[0] != SIZE) {
            return urgentCell5;
        }
        int[] urgentCell3 = findLoosingRow();
        if (urgentCell3[0] != SIZE) {
            return urgentCell3;
        }
        int[] urgentCell4 = findLoosingColumn();
        if (urgentCell4[0] != SIZE) {
            return urgentCell4;
        }

        int[] urgentCell6 = findLoosingDiagonal();
        if (urgentCell6[0] != SIZE) {
            return urgentCell6;
        }
        return new int[] {SIZE, SIZE};
    }

}
