package week3;

import java.util.Arrays;

public class DeckCards {
    String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suit = {"♠", "♣", "♦", "♥"};
    String[] deck = new String[52];

    public String[] createDeckRankOrder() {
        for (int j = 0; j < suit.length; j++)
            for (int i = 0; i < rank.length; i++)
                deck[i+ rank.length*j] = rank[i] + suit[j];
        return deck;
    }
    public String[] createDeckSuitOrder() {
        for (int j = 0; j < suit.length; j++)
            for (int i = 0; i < rank.length; i++)
                deck[j+ suit.length*i] = rank[i] + suit[j];
        return deck;
    }

    public static void main(String[] args){
        DeckCards dummy = new DeckCards();
        System.out.println(Arrays.toString(dummy.createDeckRankOrder()));
        System.out.println(Arrays.toString(dummy.createDeckSuitOrder()));


    }
}
