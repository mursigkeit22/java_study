package ObjectOrientedDesign.Week2;

public class Dog extends Animal {
    public Dog(String name, int legs, int tails) {
        super(name, legs, tails);

    }
    public void playFetch() {}

    @Override
    public void walk() {
        System.out.println("I'd rather not.");
    }
}
