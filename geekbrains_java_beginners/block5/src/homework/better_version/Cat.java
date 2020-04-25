package homework.better_version;

public class Cat extends Animal {
    private int appetite;

    public boolean isSatiety() {
        return satiety;
    }

    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }
    final static int DEFAULT_RUN_LIMIT = 200;
    final static int DEFAULT_SWIM_LIMIT = 0;
    final static double DEFAULT_JUMP_LIMIT = 2;

    public Cat(int appetite){
        super(DEFAULT_RUN_LIMIT, DEFAULT_SWIM_LIMIT,
                DEFAULT_JUMP_LIMIT);
        this.satiety = false;
        this.appetite = appetite;
    }

    public Cat(int appetite, int runLimit){
        super(runLimit, DEFAULT_SWIM_LIMIT,
                DEFAULT_JUMP_LIMIT);
        this.satiety = false;
        this.appetite = appetite;
            }


     public void eat (Bowl bowl) {
        int currentAmount = bowl.getCurrentAmount();
//         System.out.println("currentAmount: " + currentAmount);
        if (currentAmount < appetite) {
            System.out.println("This cat has appetite " + appetite +  ". Not enough food to feed this cat!");
        }
        else{
            bowl.decreaseAmount(appetite);

            satiety = true;
            System.out.println("This cat ate enough. It's not hungry anymore");
        }
     }
     public void swim(int distance){
         System.out.println("No swimming for cats");
     }
}
