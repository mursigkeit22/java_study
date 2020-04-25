package homework.better_version;

public class Cat extends Animal{
    final static int DEFAULT_RUN_LIMIT = 200;
    final static int DEFAULT_SWIM_LIMIT = 0;
    final static double DEFAULT_JUMP_LIMIT = 2;

    public Cat(){
        super(DEFAULT_RUN_LIMIT, DEFAULT_SWIM_LIMIT, DEFAULT_JUMP_LIMIT);
    }

    public Cat(int runLimit){
        super(runLimit, DEFAULT_SWIM_LIMIT, DEFAULT_JUMP_LIMIT);
            }

     public void swim(int distance){
         System.out.println("No swimming for cats");
     }
}
