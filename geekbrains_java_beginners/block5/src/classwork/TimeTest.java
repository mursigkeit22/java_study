package classwork;

import java.io.IOException;

public class TimeTest {
    public static void main(String[] args) {
        try {
            test(new StringBuffer("")); // для многопоточных приложений
            test(new StringBuilder(""));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    private static void test(Appendable obj) throws IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() +
                ": " + (after - before) + "ms.");
    }
}
