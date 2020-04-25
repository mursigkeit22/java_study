package ObjectOrientedDesign.Week2;

import java.util.ArrayList;

//Aggregation is a has-a relationship where a whole has parts that belong to it.
//There may be sharing of parts among the wholes in this relationship.
//The has-a relationship from the whole to the parts is considered weak.
//What this means is although parts can belong to the wholes,
//they can also exist independently.
//If one of the objects in the relationship is destroyed,
//it still makes sense that the other can continue to exist.


public class AggregationPetStore {
    private ArrayList<Pet> pets;
//    The list of pets is initialized to be empty.
//And a public method allows new pets to be added.
//The petstore has pets.
//This means that a petstore can have zero or more pets.
    public AggregationPetStore() {
        this.pets = new ArrayList<>();
    }
    public void add(Pet pet) {
        pets.add(pet);

    }
    public static void main(String [] args){

    }
}
