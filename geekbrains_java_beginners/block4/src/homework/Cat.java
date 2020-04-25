package homework;

public class Cat extends Animal {
    int run_limit = 200;
    int swim_limit = 0;
    int jump_limit = 2;

    @Override
    public void run(int distance) {
        System.out.println("run: " + (distance <= run_limit));

    }

    @Override
    public void swim(int distance) {
        System.out.println("swim: " + false);


    }

    @Override
    public void jump(int height) {
        System.out.println("jump: " + (height <= jump_limit));


    }
}
