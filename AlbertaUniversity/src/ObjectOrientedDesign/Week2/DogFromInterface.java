package ObjectOrientedDesign.Week2;

public class DogFromInterface implements IAnimal {
    /* Atttributes of a dog can go here */
    @Override public void move() {}

    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    @Override
    public void eat() {}
}
