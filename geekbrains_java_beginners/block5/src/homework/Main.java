package homework;



public class Main {
    public static void main(String[] args) {
        Cat [] catsArray = {new Cat(300), new Cat(50),new Cat(100)};

//        Cat cat = new Cat(100);
        Bowl bowl = new Bowl(200);
        bowl.fillTheBowl(300);
        for (Cat cat:catsArray){
            cat.eat(bowl);
        if (bowl.getCurrentAmount() < 10){
            System.out.println("Bowl is almost empty!");
            bowl.fillTheBowl(bowl.getMaxAmount());
        }
        System.out.println("Food in bowl: "+bowl.getCurrentAmount());
    }}
}
