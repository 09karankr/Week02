class Employee{
  String name;
  int id;
  int salary;
  
  Employee(String name, int id, int salary){
      this.name = name;
	  this.id = id;
	  this.salary = salary;
  
  }
  
  void displayInfo(){
        System.out.println("Name of the employee is: " + name + " id is: " + id + "and the salary is: " + salary);
  }
}


public class Main{
   public static void main(String[] args){
    Employee emp = new Employee("Ravi",01,50000);
	emp.displayInfo();   // calling the display info method
   
   }

}