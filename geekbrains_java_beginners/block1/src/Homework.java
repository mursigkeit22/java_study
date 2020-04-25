public class Homework {
    public static void main(String[] args) {
        byte c = 18;
        short d = 88;
        int a = 5;
        long b = 6789L;
        float f = 10.0f;
        double e = 17.99;
        boolean g = true;
        char s = 'A';

    }

    public Integer resultExpression(int a, int b, int c, int d) {
        if (d == 0) {
            System.err.println("Devision by zero");
            return null;
        }
        return a * (b + (c / d));

    }

    public boolean check10Between20(int a, int b) {
        return ((a + b) >= 10) && ((a + b) <= 20);
    }
public static String returnSign(int a){
        return (a >= 0) ? "positive" : "negative";
}

    public void printSign(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }


    }

    public Boolean isNegative(int a) {
        return (a<0) ? true : null;
//        if (a < 0) {
//            return true;
//        } else {
//            return null;
//        }
    }

    public void printName(String a) {
        System.out.println("Hello, " + a);
    }


    public void leapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }
}
