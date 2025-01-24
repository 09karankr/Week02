package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args){
       Manager man = new Manager("Karan",01,2000, 4);
       Developer dev = new Developer("Anshi patel", 2, 500000, "java");
       Intern inter = new Intern("Nibu", 3,20000 );

       man.displayDetails();
       dev.displayDetails();
       inter.displayDetails();

    }
}
