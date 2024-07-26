package Empleados;

import java.util.ArrayList;

public class GestionEmpleado {
    //Attributes
    private ArrayList<Empleado> employeeList;

    //Constructor
    //Empty
    public GestionEmpleado(){}
    //All
    public GestionEmpleado(ArrayList<Empleado> employeeList) {
        this.employeeList = new ArrayList<Empleado>();
    }

    //Methods



    //Getters
    public ArrayList<Empleado> getEmployeeList() {
        return this.employeeList;
    }

    //Setters
    public void setEmployeeList(ArrayList<Empleado> employeeList) {
        this.employeeList = employeeList;
    }






}
