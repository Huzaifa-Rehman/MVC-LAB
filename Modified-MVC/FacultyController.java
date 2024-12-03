
import java.util.List;


class FacultyController {
    private FacultyModel model; 
    private FacultyView view;  

   
    public FacultyController(FacultyModel model, FacultyView view) {
        this.model = model;
        this.view = view;
    }

  
    public void addFaculty(String name, String subject, String phoneNumber, String address) {
        Faculty faculty = new Faculty(name, subject, phoneNumber, address);
        model.addFaculty(faculty);
    }

   
    public void displayFacultyDetails() {
        List<Faculty> facultyList = model.getFacultyList();
        view.displayFacultyRecords(facultyList);
    }
}


class Faculty {
    private String name;
    private String subject;
    private String phoneNumber;
    private String address;

   
    public Faculty(String name, String subject, String phoneNumber, String address) {
        this.name = name;
        this.subject = subject;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}