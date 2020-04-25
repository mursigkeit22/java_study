package ObjectOrientedDesign.Week3.EducationalInstitution;

import ObjectOrientedDesign.Week3.Populace.*;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name = "Coursera";
    private List<Person> students = new ArrayList<Person>();

    public static void main(String[] args) {
        University uni = new University();
        Person student = new Person("John Doe");
        //student.name = "John Kennedy";
        uni.students.add(student);
    }
}
