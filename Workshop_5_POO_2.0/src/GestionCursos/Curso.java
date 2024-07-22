package GestionCursos;

import java.util.ArrayList;

public class Curso {
    private int code;
    private String name;
    private ArrayList<Estudiante> studentList;

    

    public Curso(int code, String name) {
        this.code = code;
        this.name = name;
        this.studentList = new ArrayList<>();  
    }

    // Métodos GET
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Estudiante> getStudentList() {
        return studentList;
    }

    // Métodos SET
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(ArrayList<Estudiante> studentList) {
        this.studentList = studentList;
    }

    public void enrollStudent(Estudiante student) {
        studentList.add(student);
    }

    public void showStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("No hay estudiantes en este curso.");
        } else {
            for (Estudiante estudiante : studentList) {
                estudiante.displayStudent();
                System.out.println("----------------------------------------");
            }
        }
    }
}
