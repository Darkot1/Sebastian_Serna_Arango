package RegistroEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<EmpleadoPermanente> permanentEmployee = new ArrayList<>();
    private ArrayList<EmpleadoTemporal> temporaryEmployee = new ArrayList<>();

    public void aggEmployee() {
        System.out.println("¿Desea agregar un empleado permanente o temporal?");
        System.out.println("1. Permanente");
        System.out.println("2. Temporal");
        int choice = scanner.nextInt();
        
        scanner.nextLine(); 

        System.out.println("Ingrese el nombre del empleado: ");
        String name = scanner.nextLine();
        
        System.out.println("Ingrese la edad del empleado: ");
        Integer age = scanner.nextInt();

        System.out.println("Ingrese el ID del empleado: ");
        Integer employeeID = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado: ");
        Integer salary = scanner.nextInt();

        if (choice == 1) {
            scanner.nextLine();
            System.out.print("Ingrese la fecha de inicio de contrato (dd-mm-yyyy): ");
            String fechaInicio = scanner.nextLine();
            
            EmpleadoPermanente PerEmployee = new EmpleadoPermanente(name, age, employeeID, salary, fechaInicio);

            permanentEmployee.add(PerEmployee);

            System.out.println("Empleado permanente con nombre: "+name+" Agregado.");
            System.out.println();

        } else if (choice == 2) {
            scanner.nextLine();
            System.out.print("Ingrese la fecha de inicio de contrato (dd-mm-yyyy): ");
            String fechaInicio = scanner.nextLine();

            System.out.print("Ingrese la fecha de fin de contrato (dd-mm-yyyy): ");
            String fechaFinContrato = scanner.nextLine();

            EmpleadoTemporal empTemporal = new EmpleadoTemporal(name, age, employeeID, salary, fechaInicio, fechaFinContrato);

            temporaryEmployee.add(empTemporal);
            System.out.println("Empleado temporal con nombre: "+name+" Agregado.");
            System.out.println();
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
