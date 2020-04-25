package homework;

import java.util.Arrays;

import static java.lang.Math.abs;

public class _7_teacher {
    public static void main(String[] args) {
        String[] sm = {"a", "b", "c", "d", "e"};
        _7_teacher _7_teacher = new _7_teacher();
        System.out.println(Arrays.toString(_7_teacher.move(sm, -1)));

    }

    public String[] move(String[] arr, int delta) {
        int len = arr.length;
        if (abs(delta) >= len) {
            delta = delta % len;
        }
        if (delta==0){return arr;}
        int curIndex = 0;
        String temp = arr[0];
        for (int i = 0; i < len; i++) {

            int nextIndex = findIndex(len, delta, curIndex);

            String buff = arr[nextIndex];
            arr[nextIndex] = temp;
            temp = buff;
            curIndex = nextIndex;


        }
        return arr;
    }

    public int findIndex(int len, int delta, int currentIndex) {
        if (delta > 0) {
            if (currentIndex < (len - delta)) {
                return currentIndex + delta;
            } else {
                return currentIndex + delta - len;
            }
        }
        else{
            if (currentIndex+delta < 0) {
                return len + delta + currentIndex;
            } else {
                return currentIndex + delta ;
            }

        }
    }
}
