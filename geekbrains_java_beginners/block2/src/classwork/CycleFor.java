package classwork;

public class CycleFor {
    public static void main(String[] args) {
        System.out.println("First cycle: ");
        for (int i = 1; i <= 3; i++){
            System.out.println("i = "+i);
        }

        int j = 0;
        System.out.println("Second cycle: ");
        for (; j <= 10; ){
            System.out.println("j = "+j);
            j++;
            System.out.println(j++);

        }

        System.out.println("Third cycle: ");
        for (int i = 4; i > 0; i--){
            System.out.println("i = "+i);
        }

        System.out.println("Forth cycle: ");
        int i = 0;
        for(;;){
            if (i > 3) {break;}
            System.out.println(i++);
        }


        System.out.println("forever cycle: ");
        for(;;){}


    }
}
