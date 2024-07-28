import controller.StudentController;

import javax.swing.*;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        StudentController studentController = new StudentController();

        String option;
        do {

            option = JOptionPane.showInputDialog(null, "welcome to HIMALAYA \n"
                    + "Options: \n"
                    + "1: Create student \n"
                    + "2: Show all students \n"
                    + "3: Search student by ID \n"
                    + "4: Delete student by ID \n"
                    + "5: Exit\n");

            switch (option) {
                case "1" -> {
                    // Input of name
                    String name = JOptionPane.showInputDialog("Ingrese su nombre");

                    // Input of age
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

                    Object result = studentController.createStudent(name, age);

                    JOptionPane.showMessageDialog(null, result);
                }

                case "2" -> {
                    studentController.readAllStudent();
                }

                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante a buscar: "));
                    Object student = studentController.readById(id);
                    JOptionPane.showMessageDialog(null, student.toString());
                }

                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante a eliminar: "));
                    studentController.deleteStudent(id);
                    JOptionPane.showMessageDialog(null, "Estudiante eliminado con éxito.");
                }
                case "5" -> {
                    JOptionPane.showMessageDialog(null, "Exit..");
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid option");

            }

        } while (!option.equals("5"));

    }


}
