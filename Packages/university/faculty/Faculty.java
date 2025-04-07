package university.faculty;

import university.courses.Course;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyId;
    private String name;
    private String email;
    private String department;
    private List<Course> teachingCourses;
    
    public Faculty(String facultyId, String name, String email, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.teachingCourses = new ArrayList<>();
    }
    

    public String getFacultyId() { return facultyId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public List<Course> getTeachingCourses() { return new ArrayList<>(teachingCourses); }
    
 
    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setInstructor(this);
        }
    }
    
    public void removeCourse(Course course) {
        if (teachingCourses.contains(course)) {
            teachingCourses.remove(course);
            course.setInstructor(null);
        }
    }
    
    @Override
    public String toString() {
        return "Faculty [ID: " + facultyId + ", Name: " + name + 
               ", Email: " + email + ", Department: " + department + 
               ", Teaching: " + teachingCourses.size() + " courses]";
    }
}
