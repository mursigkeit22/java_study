package homework;

import java.util.Arrays;

//7. *Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Нельзя пользоваться вспомогательными массивами.
public class _7 {
    public static void main(String[] args) {
        String[] sm = {"a", "b", "c", "d"};
        _7 _7 = new _7();
        System.out.println(Arrays.toString(_7.move(sm, -2)));

    }

    public String[] move(String[] arr, int n) {
        int last = arr.length - 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < last; j++) {
                    String temp = arr[j];
                    arr[j] = arr[last];
                    arr[last] = temp;

                }
            }

        }
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                for (int j = last; j > 0; j--) {
                    String temp = arr[j];
                    arr[j] = arr[0];
                    arr[0] = temp;

                }
            }

        }
        return arr;

    }
}
