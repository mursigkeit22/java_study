package homework;

import java.util.Arrays;

//2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
public class _2 {
    public static void main(String[] args) {
        int[] arr = new int [8];
//        for (int j = 0, i = 0; j < 8; i =i+3, j++) {
//            arr[j] = i;
//
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));


    }
}
