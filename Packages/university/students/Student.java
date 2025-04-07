
package university.students;

import university.courses.Course;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private String major;
    private List<Course> enrolledCourses;
    
    public Student(String studentId, String name, String email, String major) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }
    

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getMajor() { return major; }
    public List<Course> getEnrolledCourses() { return new ArrayList<>(enrolledCourses); }
    
 
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }
    
    public void dropCourse(Course course) {
        if (enrolledCourses.contains(course)) {
            enrolledCourses.remove(course);
            course.removeStudent(this);
        }
    }
    
    @Override
    public String toString() {
        return "Student [ID: " + studentId + ", Name: " + name + 
               ", Email: " + email + ", Major: " + major + 
               ", Enrolled Courses: " + enrolledCourses.size() + "]";
    }
}
