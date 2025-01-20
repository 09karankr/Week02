class Employee{
  private static String companyName = "Microsoft";
  private final int id;
  private String name;
  private String designation;
  private static int TotalEmployee =0;
  
  
  
  
  
  Employee(String name, String designation, int id){
      this.name = name;
	  this.designation =designation;
	  this.id = id;
	  TotalEmployee++;
  }
  public int getid() {
        return id;
    }
  
   private static void displayTotalEmployees(){
	  System.out.println("The total number of employee:" + TotalEmployee);
	  TotalEmployee++;
  }
  public static void displayCompanyName(){
       System.out.println("Company Name: " + companyName);
	   
 }
 
 public static void setCompanyName(String name) {
       companyName = name;
    }
	
	
 
 public void displayEmployeeDetails(){
        if(this instanceof Employee){
		   System.out.println("Company name: " + companyName);
		   System.out.println("Employee Name: " + name);
		   System.out.println("Designation of the employee: " + designation);
		   //System.out.println("Author of the book: " + author);
		   System.out.println("Employee id: " + id);
		   //System.out.println("Total number of employee: " + displayTotalEmployees);
		} else{
			 System.out.println("Object is not an instance of Employee class.");
        }
			
		}
 
 public static void main(String[] args){
      Employee emp1 = new Employee("Sudhakar singh", "SDE1" ,1);
	  Employee emp2 = new Employee("Yash Raj", "SDE2", 2);
	  
	  emp1.displayEmployeeDetails();
	  emp2.displayEmployeeDetails();
	  
      Employee.displayTotalEmployees();
	  
 
 }

}