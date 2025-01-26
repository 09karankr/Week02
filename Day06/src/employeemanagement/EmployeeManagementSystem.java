package employeemanagement;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(101, "Karan", 40000, 35000);
        fte.assignDepartment("Software");
        employees.add(fte);

        PartTimeEmployee pte = new PartTimeEmployee(102, "Rakesh", 20000, 15000,33);
        pte.assignDepartment("Customer Support");
        employees.add(pte);

        for(Employee emp : employees){
            System.out.println("---------------");
            emp.displayDetails();
            System.out.println();
        }
    }
}
