package GestionCursos;

public class Estudiante {
    
    private int id;
    private String name;
    private String email;

    public Estudiante(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void displayStudent(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+name);
        System.out.println("Correo: "+email);
    }



}
