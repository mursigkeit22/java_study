package classwork;

public class WhileDoCycle {
    public static void main(String[] args) {
        System.out.println("Cycle while: ");
        int i = 1;
        while (i <= 3){
            System.out.println(i++);
        }

        System.out.println("Cycle do while: ");
        int j = 8;
        do {System.out.println(j++);}
        while (j <= 3);
    }
}
