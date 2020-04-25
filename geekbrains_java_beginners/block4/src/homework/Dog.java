package homework;

public class Dog extends Animal {
    int run_limit = 500;
    int swim_limit = 10;
    double jump_limit = 0.5;

    public Dog(){}

    public Dog(int run_limit){
        this.run_limit = run_limit;
    }
    @Override
    public void run(int distance) {

            System.out.println("run: " + (distance <= run_limit) );

    }

    @Override
    public void swim(int distance) {
        System.out.println("swim: " + (distance <= swim_limit) );


    }

    @Override
    public void jump(int height) {
        System.out.println("jump: " + (height <= jump_limit) );


    }
}
