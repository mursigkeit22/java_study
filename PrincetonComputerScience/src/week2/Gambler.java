package week2;

public class Gambler {
    public static void main(String[] args){
        int stake = 10;
        int goal = 20;
        int trials = 2;
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() < 0.5) cash ++;
                else cash--;
                System.out.println("cash: " + cash);

            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + trials);
    }
}
