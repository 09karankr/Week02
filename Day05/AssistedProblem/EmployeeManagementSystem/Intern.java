package EmployeeManagementSystem;

public class Intern extends Employee{
    public Intern(String name, int id, int salary) {
        super(name, id, salary);
    }
   @Override
   public void displayDetails(){
        super.displayDetails();
       System.out.println("Intern");
   }
}
