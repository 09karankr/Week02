package EmployeeManagementSystem;

public class Employee {
    private String name;
    private int id;
    private  int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("The name of the employee is: " + name + " and the id is: " + id + " and the salary is: " + salary);

    }
}
