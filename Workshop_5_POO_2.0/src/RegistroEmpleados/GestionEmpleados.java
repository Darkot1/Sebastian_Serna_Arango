package RegistroEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    Scanner scanner = new Scanner(System.in);
 

    ArrayList<Empleado> employee = new ArrayList<>();



    public void addEmployee(){

        System.out.println("1: empleado permanente.");
        System.out.println("2: empleado temporal.");
        System.out.println("Que empleado desea agregar? ");
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
            System.out.println("Ingrese los años que tiene el empleado en la empresa: ");
            Integer yearsEmployed = scanner.nextInt();

            EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(name, age, employeeID, salary, yearsEmployed);
            employee.add(empleadoPermanente);
        }else if (choice == 2) {
            scanner.nextLine();

            System.out.println("Ingrese la fecha de inicio del contrato: (dd-mm-yyy)");
            String endContract = scanner.nextLine();

            EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(name, age, employeeID, salary, endContract);
            employee.add(empleadoTemporal);
        }else{
            System.out.println("Opcion invalida.");
        }


       
    }

    public void showEmployee() {
        if (employee.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
    
        for (Empleado empleado : employee) {
            System.out.println("Nombre empleado: " + empleado.getName());
            System.out.println("Edad del empleado: " + empleado.getAge());
            System.out.println("ID empleado: " + empleado.getEmployeeID());
            System.out.println("Salario del empleado: " + empleado.getSalary());
    
            if (empleado instanceof EmpleadoPermanente) {

                EmpleadoPermanente empPermanente = (EmpleadoPermanente) empleado;
                
                System.out.println("Tipo: Empleado Permanente");
                System.out.println("Años en la empresa: " + empPermanente.getYearsEmployed());

            } else if (empleado instanceof EmpleadoTemporal) {

                EmpleadoTemporal empTemporal = (EmpleadoTemporal) empleado;

                System.out.println("Tipo: Empleado Temporal");
                System.out.println("Fecha fin de contrato: " + empTemporal.getEndContract());
            }
    
            System.out.println("-------------------------");
        }
    }





}
