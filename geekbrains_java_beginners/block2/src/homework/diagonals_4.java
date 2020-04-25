package homework;
//4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
public class diagonals_4 {
    public static void main(String[] args) {
        int l = 6;
        int[][] table = new int[l][l];

        for (int i = 0; i < table.length; i++){
//            for (int j = 0; j < table.length; j++) {
//                if (i == j || i + j == table.length-1){
//                    table[i][j] = 1;
//
//                }
//            }

            table [i][i] = 1;
            table[i][table.length -i -1] = 1;
        }

        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
