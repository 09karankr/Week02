package employeemanagement;

abstract class Employee {
  private int employeeId;
  private String name;
  private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee id:" + employeeId);
        System.out.println("Name: " + name);
        System.out.println("BaseSalary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
