package Punto2;

public class Empleado {
    
    private String name;
    private String position;
    private double salary;
    private int id;
    
    public Empleado(String name, String position, double salary, int id) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Posicion: " + position);
        System.out.println("Salario: " + salary);

    }



    
}
