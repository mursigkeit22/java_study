package homework.better_version;

public class Dog extends Animal{
    final static int DEFAULT_RUN_LIMIT = 500;
    final static int DEFAULT_SWIM_LIMIT = 10;
    final static double DEFAULTJUMP_LIMIT = 0.5;

    public Dog(){
        super(DEFAULT_RUN_LIMIT, DEFAULT_SWIM_LIMIT, DEFAULTJUMP_LIMIT);
    }

    public Dog(int runLimit){
        super(runLimit, DEFAULT_SWIM_LIMIT, DEFAULTJUMP_LIMIT);
    }
}
