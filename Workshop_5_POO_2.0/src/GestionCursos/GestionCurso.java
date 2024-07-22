package GestionCursos;

import java.util.ArrayList;

public class GestionCurso {
    private ArrayList<Curso> courses;

    public GestionCurso() {
        this.courses = new ArrayList<>(); 
    }

    public ArrayList<Curso> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Curso> courses) {
        this.courses = courses;
    }

    public void addCourse(Curso curso) {
        courses.add(curso);
    }

    public Curso searchCourse(int codigo) {
        for (Curso curso : courses) {
            if (curso.getCode() == codigo) {
                return curso;
            }
        }
        return null;
    }

    public void showCourses() {
        for (Curso curso : courses) {
            System.out.println("Código: " + curso.getCode() + ", Nombre: " + curso.getName());
        }
    }

    public void enrollStudentCourse(int codigo, Estudiante estudiante) {
        Curso curso = searchCourse(codigo);
        if (curso != null) {
            curso.enrollStudent(estudiante);
            System.out.println("Estudiante inscrito en el curso: " + curso.getName());
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    public void listStudentsInCourse(int codigo) {
        Curso curso = searchCourse(codigo);
        if (curso != null) {
            curso.showStudentList();
        } else {
            System.out.println("Curso no encontrado");
        }
    }
}
