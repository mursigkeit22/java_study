package week2.Factors;


public class Factors2 {
    public static void main(String[] args)
    {
        long n = 999999999999999999L;
        for (int i = 2; i < n/i; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) System.out.println(n);
        else System.out.println();
    }
}