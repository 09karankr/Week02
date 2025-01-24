package EmployeeManagementSystem;

public class Developer extends Employee{
    private String programmingLang;

    public Developer(String name, int id, int salary, String programmingLang) {
        super(name, id, salary);
        this.programmingLang = programmingLang;
    }
  @Override
  public void displayDetails(){
        super.displayDetails();
      System.out.println("Programming language: " + programmingLang);

  }


}
