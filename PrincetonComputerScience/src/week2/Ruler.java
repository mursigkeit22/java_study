package week2;

public class Ruler {
    public static void main(String[] args) {
        int N = 5;
        String ruler = " ";
        for (int i = 1; i <= N; i++) {
            ruler = ruler + i + ruler;
        }
        System.out.println(ruler);
    }
}
