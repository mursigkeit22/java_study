package classwork;

import java.util.Scanner;

public class ZeroToN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter last number: ");
        int limit = userInput.nextInt();
        userInput.close();

        int counter = 0;
        System.out.println("Even numbers: ");
        while (counter <= limit){
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
