import java.util.*;


class Course {
    private int courseId;
    private String courseName;
    private double fees;

    static int totalCourses = 0;

    public Course(int courseId, String courseName, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
        totalCourses++;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getFees() {
        return fees;
    }

    public void displayCourse() {
        System.out.println(courseId + " - " + courseName + " - Fees: " + fees);
    }
}


class Student {
    private int studentId;
    private String studentName;

    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

 
    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
    }

   
    public void displayStudentDetails() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");

        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}


public class CourseManagementSystem {
    public static void main(String[] args) {

     
        Course c1 = new Course(101, "Java", 5000);
        Course c2 = new Course(102, "Python", 4000);
        Course c3 = new Course(103, "Web Development", 6000);

    
        Student s1 = new Student(1, "Madhura");
        Student s2 = new Student(2, "Rahul");

        
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);
        s2.enrollCourse(c3);

   
        s1.displayStudentDetails();
        s2.displayStudentDetails();

     
        System.out.println("\nTotal Courses: " + Course.totalCourses);
    }
}