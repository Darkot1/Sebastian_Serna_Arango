package Empleados;

public class Empleado extends Persona {
    //Attributes
    private int idEmployee;
    private int salary;

    //Constructor
    //empty
    public Empleado(){}
    //All
    public Empleado(String name, int age, int idEmployee, int salary){
        super(name, age);
        this.idEmployee = idEmployee;
        this.salary = salary;
    }

    //Getters
    public int getIdEmployee() {
        return this.idEmployee;
    }

    public int getSalary() {
        return this.salary;
    }

    //Setters
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "Empleado[idEmployee = "+ this.idEmployee+", salary = "+ this.salary+"]";
    }



}
