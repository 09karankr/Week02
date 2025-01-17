class Student{
   private String name;
   private int rollNumber;
   private double marks;
   
   Student(String name, int rollNumber, double marks){
      this.name = name;
	  this.rollNumber = rollNumber;
	  this.marks = marks;
   
   }
     
   public String gradeCalculate(double marks){
         if (marks > 0 && marks < 33) {
            return "Fail";
        } else if (marks >= 33 && marks < 60) {
            return "Grade B";
        } else if (marks >= 60 && marks <= 100) {
            return "Grade A";
        } else {
            return "Invalid marks";
        }
        
   }
  public void displayStudentDetails(){
     System.out.println("The name of the student is " + name + " and the rollNumber is " + rollNumber + " and the marks is " + marks);
     System.out.println("The grade of the student as per the given marks is " + gradeCalculate(marks));
   }
   
  
}
public class StudentReport{
  public static void main(String[] args){
     Student student = new Student("Rahul",22, 69);
     student.displayStudentDetails();
  }

}