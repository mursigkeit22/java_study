package homework;

public abstract class Animal {

    protected int runLimit;
    protected int swimLimit;
    protected double jumpLimit;

    public Animal(int runLimit, int swimLimit, double jumpLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(int distance) {
        System.out.println("run: " + ((distance <= runLimit)&&(distance>0)));

    }

    public void swim(int distance) {
        System.out.println("swim: " + ((distance <= swimLimit)&&(distance>0)));


    }

    public void jump(int height) {
        System.out.println("jump: " + ((height <= jumpLimit)&&(height>0)));
    }
}