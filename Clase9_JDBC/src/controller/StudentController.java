package controller;

import javax.swing.JOptionPane;


import entity.Student;
import model.StudentModel;

public class StudentController {

    StudentModel objStudentModel;


    public StudentController(){
        this.objStudentModel = new StudentModel();
    }

    public void createStudent(){
        
        //Input of name
        String name = JOptionPane.showInputDialog("Ingrese su nombre");

        //Input of age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        //Create instance of student
        Student objStudent = new Student(name, age);

        Student result = (Student) this.objStudentModel.create(objStudent);


        JOptionPane.showMessageDialog(null, result);

    }

    





    
}
