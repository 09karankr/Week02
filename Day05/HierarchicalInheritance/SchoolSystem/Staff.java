package SchoolSystem;

public class Staff extends Person {
    private String department;


    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }


    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }


    public void displayDepartment() {
        System.out.println(name + " works in the " + department + " department");
    }



}
