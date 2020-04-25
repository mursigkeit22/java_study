package homework;

public class Employee {
    String name;
    String position;
//    String email;
//    String phone_number;
//    Integer salary;
//    int age;
    public Employee(String name, String position)
//                    String email,
//            String phone_number, Integer salary, int age)
    {
        this.name = name;
        this.position = position;
//        this.email = email;
//        this.phone_number = phone_number;
//        this.salary =salary;
//        this.age = age;
    }
    public void printInfo(){
        System.out.println(name + ' ' + position);
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[2];
        employeeArray[0] = new Employee("Ivanov", "Engineer");
        employeeArray[1] = new Employee("Ivanova", "Teacher");
        for (Employee person:employeeArray) {
            person.printInfo();
        }
    }
}











