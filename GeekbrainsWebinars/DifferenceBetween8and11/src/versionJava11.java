import java.io.*;
import java.util.*;

public class versionJava11 {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println(version); //11.0.6
//        String _ = "aaa"; // impossible since Java 9
//        System.out.println(_);
        List<Integer> intList = List.of(1, 2, 3, 4, 5); // неизменяемый
        System.out.println(intList);
        //как сделать изменяемый?
        List<Integer> changableIntList = new ArrayList<>(intList);
        changableIntList.add(8);
        System.out.println(changableIntList);
        Set<Integer> mySet = Set.of(2, 3, 4, 5);
        List<Integer> newList = Objects.requireNonNullElse(intList, new ArrayList<>());
        System.out.println(newList);
        String fileName = "C:\\mein\\study\\JJava\\DifferenceBetween8and11\\src\\versionJava8.java";
        try
        {
            InputStream inputS = new FileInputStream(fileName);// поток ввода
            OutputStream outputS = new FileOutputStream((fileName + ".copy"));// поток выводы
            inputS.transferTo(outputS);// перекачиваем данные из потока ввода в поток вывода
        } catch (IOException e) {
            e.printStackTrace();
        }
        var __ = "aaa";
        var ix = 1;
        var var = new Object();


    }
}
