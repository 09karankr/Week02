import java.util.ArrayList;
import java.util.List;


class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    public void displayFacultyMembers() {
        System.out.println("Faculty members in department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName());
        }
    }
}

// University class
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in university: " + name);
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        departments.clear();
    }
}

// Main class
public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        // Create a university
        University university = new University("IIT DELHI");

        // Create departments
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        // Add departments to the university
        university.addDepartment(cs);
        university.addDepartment(ee);

        // Create faculty members
        Faculty Siddhu = new Faculty("Siddhu");
        Faculty Nitish = new Faculty("Nitish");
        Faculty Karan = new Faculty("Karan");

        // Add faculty members to departments
        cs.addFaculty(Siddhu);
        cs.addFaculty(Nitish);
        ee.addFaculty(Karan);

      
        university.displayDepartments();

        // Display faculty in each department
        cs.displayFacultyMembers();
        ee.displayFacultyMembers();

        // Delete university
        university.deleteUniversity();
        university.displayDepartments(); 

        // Faculty members still exist independently
        System.out.println("Faculty members exist independently:");
        System.out.println("- " + Siddhu.getName());
        System.out.println("- " + Nitish.getName());
        System.out.println("- " + Karan.getName());
    }
}
