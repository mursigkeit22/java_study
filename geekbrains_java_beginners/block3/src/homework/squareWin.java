package homework;

public class squareWin {
    static int SIZE = 3;
    static char[][] map = {{'▢', '▢', '-'}, {'▢', '▢', '▢'}, {'▢', '▢', 'z'}};

    public static void main(String[] args) {
//        System.out.println(firstDiagonal('▢'));
        System.out.println(secondDiagonal('▢'));
//        System.out.println((winVertHor(2,0)));
    }

    public static boolean winVertHor(int x, int y) {
        boolean result1 = true;
        boolean result2 = true;

        char el = map[x][y];
        for (int i = 0; i < SIZE; i++) {
            if (map[x][i] != el) {
                result1 = false;
                break;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (map[i][y] != el) {
                result2 = false;
                break;
            }
        }

        return result1 || result2;
    }

    public static boolean firstDiagonal(char el) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j) {
                    if (map[i][j] != el) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean secondDiagonal(char el) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == SIZE - i - 1) {
                    if (map[i][j] != el) {
                        return false;
                    }
                }
            }
        }
        return true;


    }
}
