package Punto2;

import java.util.ArrayList;

public class GestionEmpleado {
    
    ArrayList<Empleado> empleados;

    public GestionEmpleado() {
    }

    public GestionEmpleado(ArrayList<Empleado> empleados) {
        this.empleados = new ArrayList<>();
    }


    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            System.out.println("------------------------------------");
        }
    }

}
