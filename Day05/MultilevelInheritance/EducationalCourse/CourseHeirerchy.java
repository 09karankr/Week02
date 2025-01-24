package EducationalCourse;

public class CourseHeirerchy {
    public static void main(String[] args) {
        // Creating a general course
        Course generalCourse = new Course("Mathematics 101", 40);
        generalCourse.displayInfo();
        System.out.println();

        // Creating an online course
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 50, "Udemy", true);
        onlineCourse.displayInfo();
        System.out.println();

        // Creating a paid online course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science Bootcamp", 100, "Coursera", true, 500, 20);
        paidCourse.displayInfo();
    }
}
