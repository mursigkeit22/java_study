package homework;

import java.util.Arrays;

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
// пройти по нему циклом, и числа, меньшие 6, умножить на 2;
public class _3 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++){
            int j = arr[i];
            if (j < 6) {arr[i] = j*2;}

        }
        System.out.println(Arrays.toString(arr));


    }
}
