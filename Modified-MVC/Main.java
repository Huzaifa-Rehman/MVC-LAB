import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
      
        FacultyModel model = new FacultyModel();
        FacultyView view = new FacultyView();
        
        
        FacultyController controller = new FacultyController(model, view);

       
        controller.addFaculty("Dr. John Doe", "Computer Science", "123-456-7890", "123 Main St, Karachi");
        controller.addFaculty("Dr. Jane Smith", "Calculus", "987-654-3210", "456 Elm St, Lahore");
        controller.addFaculty("Dr. Alice Johnson", "Physics", "555-123-4567", "789 Pine St, Islamabad");
        controller.addFaculty("Dr. Bob Brown", "Biology", "444-555-6666", "321 Oak St, Karachi");
        controller.addFaculty("Dr. Charlie Davis", "Chemistry", "777-888-9999", "654 Maple St, Peshawar");

       
        controller.displayFacultyDetails();
    }
}
