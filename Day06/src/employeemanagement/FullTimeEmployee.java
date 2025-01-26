package employeemanagement;

 class FullTimeEmployee extends Employee implements Department {
     private double fixedSalary;
     private String department;

     public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
         super(employeeId, name, baseSalary);
         this.fixedSalary = fixedSalary;

     }

     @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    @Override
     public void assignDepartment(String departmentName){
         this.department = departmentName;
    }

    @Override
     public String getDepartmentDetails(){
         return "Full time employee department: " + department;
    }

    @Override
     public void displayDetails(){
         super.displayDetails();
        System.out.println(getDepartmentDetails());

    }

}
