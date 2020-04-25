package classwork;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] table = new int[3][];
        table[0] = new int[1];
        table[1] = new int[5];
        table[2] = new int[3];
        System.out.println(Arrays.deepToString(table));

    }
}
