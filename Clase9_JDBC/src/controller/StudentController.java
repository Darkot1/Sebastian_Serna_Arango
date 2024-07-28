package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Student;
import model.StudentModel;

public class StudentController {

    StudentModel objStudentModel;

    public StudentController() {
        this.objStudentModel = new StudentModel();
    }

    public Object createStudent(String name, int age) {

       // Crear una instancia de Student
       Student student = new Student();
       student.setName(name);
       student.setAge(age);

       // Llamar al método create del modelo con el objeto Student
       return this.objStudentModel.create(student);

    }

    public void readAllStudent() {

        ArrayList<Object> result = this.objStudentModel.readAll();

        JOptionPane.showMessageDialog(null, result);

    }

    public Object readById(int id) {
        return this.objStudentModel.readById(id);
    }

    public Object deleteStudent(int id){
        return this.objStudentModel.delete(id);
    }

    

}
