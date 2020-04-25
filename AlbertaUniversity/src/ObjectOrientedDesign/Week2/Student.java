package ObjectOrientedDesign.Week2;

public class Student {
    private float gpa;
    private String degreeProgram;

    public float getGPA() {
        return gpa;
    }
    public void setGPA(float newGPA) {
        gpa = newGPA;
    }

    public String getDegreeProgram(){
        return degreeProgram;
    }

    public void setDegreeProgram(String newDegreeProgram) {
        if (gpa > 2.7) {
            degreeProgram = newDegreeProgram;
        }
    }
}

