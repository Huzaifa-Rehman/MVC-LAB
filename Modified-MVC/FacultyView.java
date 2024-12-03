
import java.util.List;

class FacultyView {
    
    public void displayFacultyRecords(List<Faculty> facultyList) {
        System.out.println("Faculty Records:");
        for (Faculty faculty : facultyList) {
            System.out.println("Name: " + faculty.getName());
            System.out.println("Subject: " + faculty.getSubject());
            System.out.println("Phone: " + faculty.getPhoneNumber());
            System.out.println("Address: " + faculty.getAddress());
            System.out.println("----------------------");
        }
    }
}