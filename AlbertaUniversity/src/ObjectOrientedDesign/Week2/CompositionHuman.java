package ObjectOrientedDesign.Week2;

//Composition is an exclusive containment of parts,
//otherwise known as a strong has-a relationship.
//What this means is that the whole cannot exist without its parts.
//If loses any of its parts, the whole ceases to exist.
//If the whole is destroyed, then all of its parts are destroyed too.
//Usually, you can only access the parts through its whole.
//Contained parts are exclusive to the whole.

public class CompositionHuman {

//    the brain is created at the same time that the human object is.
//The brain does not need to be instantiated anywhere else, nor
//does it need to be passed into the human object on creation.
//The brain is automatically created with the human.
//The two parts, human and brain,
//are tightly dependent with one not being able to exist without the other.

    private Brain brain;
    public CompositionHuman() {
        brain = new Brain();}
}
