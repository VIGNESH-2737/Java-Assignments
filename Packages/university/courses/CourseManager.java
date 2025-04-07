package university.courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses;
    
    public CourseManager() {
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
    
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
    
    public List<Course> getCoursesByCredits(int minCredits, int maxCredits) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCredits() >= minCredits && course.getCredits() <= maxCredits) {
                result.add(course);
            }
        }
        return result;
    }
}
