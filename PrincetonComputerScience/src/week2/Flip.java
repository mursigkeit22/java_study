package week2;

public class Flip {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            double randomI = Math.random();
            System.out.println(randomI);

        if (randomI < 0.5)
            System.out.println("Heads");
        else {
            System.out.println("Tails");

        }
    }
} }
