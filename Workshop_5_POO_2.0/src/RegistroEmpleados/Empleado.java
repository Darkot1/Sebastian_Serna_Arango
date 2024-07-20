package RegistroEmpleados;
import java.util.Scanner;
public class Empleado extends Persona{

    Scanner scanner = new Scanner(System.in);

    private Integer employeeID;
    private Integer salary;


    public Empleado(String name, Integer age, Integer employeeID, Integer salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    
    //METODOS GET
    public Integer getEmployeeID() {
        return employeeID;
    }
    
    public Integer getSalary() {
        return salary;
    }

    //METODOS SET
    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    




}
