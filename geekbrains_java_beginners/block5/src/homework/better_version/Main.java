package homework.better_version;


public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = {new Cat(300), new Cat(50),new Cat(150)};

        Bowl bowl = new Bowl(200);
        bowl.fillTheBowl(300);
        for (Cat cat:catsArray){
            System.out.println("We've got a new cat here.");
            cat.eat(bowl);
        if (bowl.getCurrentAmount() < 10){
            System.out.println("It's time to fill the bowl!");
            bowl.fillTheBowl(bowl.getMaxAmount());
        }
        System.out.println("Food left in bowl: "+bowl.getCurrentAmount());
    }}
}
