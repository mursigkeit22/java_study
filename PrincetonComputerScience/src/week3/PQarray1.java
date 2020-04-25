package week3;

import java.util.Arrays;

public class PQarray1 {
    public static void main(String[] args){
        int[] a = new int[6];
        int[] b = new int[a.length];
        System.out.println(Arrays.toString(a));
        System.out.println(b);
        //Use toString() if you want to print one-dimensional array and use deepToString() method if you want to print two-dimensional array.
        //Array, despite being Object and providing a length field, doesn't seem overriding toString() method from java.lang.Object class.
        // All it prints is type@somenumber.the toString method from Object class is getting invoked:
        //public String toString() {
        //    return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //}
        //Read more: https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html#ixzz6Fpz2v9S2

        b = a;
        for (int i = 1; i < b.length; i++)
            b[i] = 1;

        System.out.println(Arrays.toString(a));
        System.out.println(b);
    }
}
