package homework;

import java.util.Arrays;

//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
// (без помощи интернета);
public class _5 {
    public static void main(String[] args) {
        int [] arr = {111, 5, 3, 2, 11, 4, 5, 15, 4, 8, -6, 90 };
        int tempMax = arr[0];
        int tempMin = arr[0];

        for (int i : arr){

            if (i > tempMax) { tempMax = i;}
            if (i < tempMin) { tempMin = i;}

        }
        System.out.println(tempMax);
        System.out.println(tempMin);



    }
}
