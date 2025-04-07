package university.faculty;

import java.util.ArrayList;
import java.util.List;

public class FacultyManager {
    private List<Faculty> facultyMembers;
    
    public FacultyManager() {
        this.facultyMembers = new ArrayList<>();
    }
    
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }
    
    public Faculty findFacultyById(String facultyId) {
        for (Faculty faculty : facultyMembers) {
            if (faculty.getFacultyId().equals(facultyId)) {
                return faculty;
            }
        }
        return null;
    }
    
    public List<Faculty> getAllFaculty() {
        return new ArrayList<>(facultyMembers);
    }
    
    public List<Faculty> getFacultyByDepartment(String department) {
        List<Faculty> result = new ArrayList<>();
        for (Faculty faculty : facultyMembers) {
            if (faculty.getDepartment().equalsIgnoreCase(department)) {
                result.add(faculty);
            }
        }
        return result;
    }
}
