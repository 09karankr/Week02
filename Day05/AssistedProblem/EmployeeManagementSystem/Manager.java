package EmployeeManagementSystem;

import javax.xml.namespace.QName;

public class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);

    }
}
