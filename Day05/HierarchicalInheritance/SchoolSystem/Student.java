package SchoolSystem;

public class Student extends Person{
    private String grade;


    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }


    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }


    public void displayGrade() {
        System.out.println(name + " is in grade " + grade);
    }

}
