package week1;

public class TestMath {
    public static void main (String [] args) {
        double a = 1.1;
        double b = 0;
        double c = 0.0;
        int d = 0;

        System.out.println(a/b); //Infinity
        System.out.println(a/c); //Infinity
        System.out.println(c/b); //NaN
        System.out.println(b/b); //NaN
        System.out.println(a/d); //Infinity



    }
}
