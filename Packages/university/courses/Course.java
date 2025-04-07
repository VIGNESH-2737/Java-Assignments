package university.courses;

import university.students.Student;
import university.faculty.Faculty;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private String description;
    private int credits;
    private Faculty instructor;
    private List<Student> enrolledStudents;
    
    public Course(String courseCode, String title, String description, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public String getCourseCode() { return courseCode; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getCredits() { return credits; }
    public Faculty getInstructor() { return instructor; }
    public void setInstructor(Faculty instructor) { this.instructor = instructor; }
    public List<Student> getEnrolledStudents() { return new ArrayList<>(enrolledStudents); }
    
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }
    
    @Override
    public String toString() {
        return "Course [Code: " + courseCode + ", Title: " + title + 
               ", Credits: " + credits + ", Instructor: " + 
               (instructor != null ? instructor.getName() : "Not assigned") + 
               ", Students: " + enrolledStudents.size() + "]";
    }
}
