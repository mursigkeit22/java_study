package week2;

public class whileWithoutBraces {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int v = 1;
        while (i <= n)
            System.out.println(v); // without {} java will see only this line
        i = i + 1;
        v = 2 * v;
    }
}
