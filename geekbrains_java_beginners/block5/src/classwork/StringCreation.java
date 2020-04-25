package classwork;

import java.nio.charset.StandardCharsets;

public class StringCreation {

    public static void main(String[] args) {
        String s1 = "Java";
        String s11 = "Java";
        String s12 = new String ("Java");
        String s2 = new String("Home");
        String s3 = new String(new char[]{'A', 'B', 'C'});
        String s4 = new String(s3);
        String s5 = new String(new byte[]{65, 66, 67});
        String s6 = new String(new byte[]{0, 65, 0, 66}, StandardCharsets.UTF_16);
        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s, s6 = %s", s1, s2, s3, s4, s5, s6);
        System.out.println();
        System.out.println("s3.equals(s4): " + s3.equals(s4));
        System.out.println(s1 == s11);
        System.out.println(s1 == s12);
    }
}
