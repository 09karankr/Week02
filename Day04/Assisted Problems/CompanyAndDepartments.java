import java.util.ArrayList;

class Employee {
    private String name;
    private int Employee_ID;
    private String position;

    Employee(String name, int Employee_ID, String position) {
        this.name = name;
        this.Employee_ID = Employee_ID;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "'}";
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name, int Employee_ID, String position) {
        employees.add(new Employee(name, Employee_ID, position));
    }

    public void displayEmployees() {
        System.out.println("Employees in Department " + name + ":");
        for (Employee employee : employees) {
            System.out.println("- " + employee);
        }
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "'}";
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName, int Employee_ID, String position) {
        for (Department dep : departments) {
            if (departmentName.equals(dep.getName())) {
                dep.addEmployee(employeeName, Employee_ID, position);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found!");
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            System.out.println(department);
            department.displayEmployees();
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Siddhu", 101, "Developer");
        company.addEmployeeToDepartment("IT", "Nibu", 102, "System Analyst");
        company.addEmployeeToDepartment("HR", "Nitish", 201, "Recruiter");

        company.displayCompanyDetails();
    }
}
