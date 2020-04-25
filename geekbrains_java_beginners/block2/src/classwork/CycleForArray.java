package classwork;

public class CycleForArray {
    public static void main(String[] args) {

        String[] sm = {"a", "d","v","z"};
        System.out.println("First variant: ");
        for (int i = 0; i < sm.length; i++){
            System.out.println(sm[i] + " ");
        }

        System.out.println("Second variant: ");
        for (String o: sm){
            System.out.print(o + " ");
        }


    }
}
