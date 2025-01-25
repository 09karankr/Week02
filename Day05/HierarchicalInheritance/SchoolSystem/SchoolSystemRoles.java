package SchoolSystem;

public class SchoolSystemRoles {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();
        teacher.displaySubject();
        System.out.println();


        // Creating a student
        Student student = new Student("Bob Smith", 16, "10th Grade");
        student.displayInfo();
        student.displayRole();
        student.displayGrade();
        System.out.println();


        // Creating a staff member
        Staff staff = new Staff("Charlie Brown", 40, "Administration");
        staff.displayInfo();
        staff.displayRole();
        staff.displayDepartment();
    }
}
