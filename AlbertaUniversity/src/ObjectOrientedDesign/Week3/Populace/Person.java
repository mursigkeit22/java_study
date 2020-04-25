package ObjectOrientedDesign.Week3.Populace;

public class Person {
    protected String name;
    public Person(String newName) {
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
}
