package homework;

import java.util.Arrays;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class _1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] == 1) ? 0 : 1;
//            int j = arr[i];
//            if (j == 0) {arr[i] = 1;}
//            else {arr[i] = 0;}
        }
        System.out.println(Arrays.toString(arr));

    }
}
