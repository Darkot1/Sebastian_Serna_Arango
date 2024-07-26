import java.sql.SQLException;

import controller.StudentController;

public class App {
    public static void main(String[] args) throws SQLException{
        
        StudentController studentController = new StudentController();

        studentController.createStudent();
        
    }
}
