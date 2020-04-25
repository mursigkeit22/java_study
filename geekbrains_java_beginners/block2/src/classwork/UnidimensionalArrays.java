package classwork;

import java.util.Arrays;

public class UnidimensionalArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("arr1:");
        System.out.println(Arrays.toString(arr1));
        int i = 0;
        arr1[i] = i++; // postincrement
        arr1[i] = i++;
        arr1[i] = i++;
        System.out.println(Arrays.toString(arr1));


        int[] arr2 = new int[5];
        System.out.println("arr2:");

        System.out.println(Arrays.toString(arr2));
        arr2[0] = 1;
        arr2[2] = 10;
        arr2[4] = 10;
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = {1, 2, 555, 2, 1};
        System.out.println("arr3:");
        System.out.println(Arrays.toString(arr3));


    }
}
