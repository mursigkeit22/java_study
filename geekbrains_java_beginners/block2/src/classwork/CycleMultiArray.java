package classwork;

public class CycleMultiArray {
    public static void main(String[] args) {
        int counter = 1;
        int [][] table = new int [3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++) {
                table[i][j]=counter;
                counter++;
            }
        }
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
