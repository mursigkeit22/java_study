package ObjectOrientedDesign.Week3;

public class Person {
    public String name;

    public void sleep(int n) throws InterruptedException {
        wait(n);
    }

    public static void main(String[] args) throws InterruptedException {
        Person johnDoe = new Person();
        johnDoe.name = "John Doe";
        johnDoe.sleep(6000);
    }
}
