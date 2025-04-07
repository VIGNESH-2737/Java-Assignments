import university.students.Student;
import university.students.StudentManager;
import university.courses.Course;
import university.courses.CourseManager;
import university.faculty.Faculty;
import university.faculty.FacultyManager;

public class UniversityApp {
    public static void main(String[] args) {
        
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        FacultyManager facultyManager = new FacultyManager();
        
       
        Student student1 = new Student("S001", "Alice Johnson", "alice@uni.edu", "Computer Science");
        Student student2 = new Student("S002", "Bob Smith", "bob@uni.edu", "Mathematics");
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        
        Course course1 = new Course("CS101", "Introduction to Programming", "Basic programming concepts", 3);
        Course course2 = new Course("MATH201", "Linear Algebra", "Vector spaces and linear transformations", 4);
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        
        Faculty faculty1 = new Faculty("F001", "Dr. Smith", "smith@uni.edu", "Computer Science");
        Faculty faculty2 = new Faculty("F002", "Dr. Lee", "lee@uni.edu", "Mathematics");
        facultyManager.addFaculty(faculty1);
        facultyManager.addFaculty(faculty2);
        
        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
        
        System.out.println("=== University Management System ===");
        System.out.println("\nAll Students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student);
        }
        
        System.out.println("\nAll Courses:");
        for (Course course : courseManager.getAllCourses()) {
            System.out.println(course);
        }
        
        System.out.println("\nAll Faculty:");
        for (Faculty faculty : facultyManager.getAllFaculty()) {
            System.out.println(faculty);
        }
        
        System.out.println("\nStudents enrolled in " + course2.getTitle() + ":");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(" - " + student.getName());
        }
        
        System.out.println("\nCourses taught by " + faculty1.getName() + ":");
        for (Course course : faculty1.getTeachingCourses()) {
            System.out.println(" - " + course.getTitle());
        }
    }
}
