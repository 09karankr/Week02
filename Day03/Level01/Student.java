class Student{
   private static String universityName = "RGPV";
   private String name;
   private final int rollNumber;
   private String grade;
   private static int TotalStudents = 0;
   
   Student(String name, String grade, int rollNumber ){
        this.name = name;
		this.grade= grade;
		this.rollNumber = rollNumber;
		TotalStudents++;
   
   }
   
   public int getRoll(){
     return rollNumber;
   
   }
   private static void displayTotalStudents(){
     System.out.println("The total number of students: " + TotalStudents);
	 TotalStudents++;
   
   }
   public static void displayUniversityName(){
   
      System.out.println("University name is: " + universityName);
   
   }
   public static void setUniversityName(String name){
      universityName = name;
   
   }
   
   public void displayStudentDetails(){
      if(this instanceof Student){
	       System.out.println("University name: " + universityName);
		   System.out.println("Student name: " + name);
		   System.out.println("Roll number of the student: " + rollNumber);
		   System.out.println("The grade of the student of: " + grade);
		 } else{
 		    System.out.println("Object is not a instance of Student class");
			
		 }
   
   }
   
    // Method to upgrade the grade
    public void setGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }
	
   public static void main(String[] args){
       Student s1 = new Student("Karan Kumar", "A", 12);
	   Student s2 = new Student("Anshi Patel", "A+", 13);
	   
	   s1.displayStudentDetails();
	   s2.displayStudentDetails();
	   
	  // Student.displayUniversityName();
	   System.out.println("");
	   
	   // Upgrading the grade
        System.out.println("\nUpgrading grades...");
        s1.setGrade("A+");
        s2.setGrade("S");
         System.out.println("");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
   
   }
   

}