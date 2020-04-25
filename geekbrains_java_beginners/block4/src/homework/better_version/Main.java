package homework.better_version;



public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(1000);
        Cat cat = new Cat();
        cat.swim(10);
        Dog extraDog = new Dog(2000);
        System.out.println(extraDog.runLimit);
        extraDog.run(1000);
    }
}
