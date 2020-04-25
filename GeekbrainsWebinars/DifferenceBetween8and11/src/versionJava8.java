import java.util.ArrayList;
import java.util.List;

// versions can be changed in File->Project Structure
public class versionJava8 {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println(version); //1.8.0_231
//        String _ = "aaa"; // possible in Java 8 and before
//        System.out.println(_);
        int[] intArr = {1,2,3,4,5}; // impossible to change size
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);

    }
}
