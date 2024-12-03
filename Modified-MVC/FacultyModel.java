
import java.util.ArrayList;
import java.util.List;


class FacultyModel {
    private List<Faculty> facultyList;  

  
    public FacultyModel() {
        this.facultyList = new ArrayList<>();
    }

   
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

   
    public List<Faculty> getFacultyList() {
        return facultyList;
    }
}