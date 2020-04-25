package week3;

import java.util.Arrays;

public class RandomSequence {
    public static void main(String[] args) {
        int N = 10;
        String[] sequence = new String[N];
        DeckCards Helper = new DeckCards();
        String[] deck = Helper.createDeckRankOrder();

        for (int i = 0; i < N; i++) {
            double temp = Math.random() * deck.length; // Math.random() returns a double greater than or equal to 0.0 and less than 1.0
            int randomNumber = (int) temp;
            System.out.println("Math.random()* deck.length: " + temp + " -> " + randomNumber);

            sequence[i] = deck[randomNumber];
        }
        System.out.println(Arrays.toString(sequence));

    }
}
