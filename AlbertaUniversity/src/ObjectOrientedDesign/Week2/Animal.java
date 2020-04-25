package ObjectOrientedDesign.Week2;

public abstract class Animal {
    protected int numberOfLegs;
    protected int numberOfTails;
    protected String name;

    public Animal(String petName, int legs, int tails) {
        this.name = petName;
        this.numberOfLegs = legs;
        this.numberOfTails = tails;
    }
    public void walk() {};
    public void run() {};
    public void eat() {};

}
