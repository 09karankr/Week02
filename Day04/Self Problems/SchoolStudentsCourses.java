import java.util.ArrayList;
import java.util.List;


class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in course: " + name);
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}


class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }

    public void displayEnrolledCourses() {
        System.out.println("Courses enrolled by student: " + name);
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getName());
        }
    }
}

// School class
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("Students in school: " + name);
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}


public class SchoolStudentsCourses {
    public static void main(String[] args) {
       
        School school = new School("Green Valley High");

        
        Student Karan = new Student("Karan");
        Student Aditya = new Student("Aditya");

        
        school.addStudent(Karan);
        school.addStudent(Aditya);

      
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Students enroll in courses
        Karan.enrollInCourse(math);
        Karan.enrollInCourse(science);
        Aditya.enrollInCourse(math);

        // Display school students
        school.displayStudents();

        // Display courses for each student
        Karan.displayEnrolledCourses();
        Aditya.displayEnrolledCourses();

        // Display students enrolled in each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}
