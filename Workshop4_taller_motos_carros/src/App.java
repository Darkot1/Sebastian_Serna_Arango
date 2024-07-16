import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de trabajadores del taller: ");
        int maxEmployees = scanner.nextInt();
        
        taller taller = new taller(maxEmployees);
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu del Taller:");
            System.out.println("1. Agregar trabajo");
            System.out.println("2. Mostrar trabajos");
            System.out.println("3. Contar vehiculos en el taller");
            System.out.println("4. Buscar vehiculo");
            System.out.println("5. Editar estado de vehiculo");
            System.out.println("6. Salir");
            
            System.out.print("Seleccione una opcion: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    System.out.println("Ingrese la cantidad de trabajos a realizar: ");
                    int jobsNumber = scanner.nextInt();
                    scanner.nextLine(); 

                    if (jobsNumber <= maxEmployees) {
                        for (int i = 0; i < jobsNumber; i++) {
                            System.out.println("Ingrese la informacion del trabajo " + (i + 1) + ": ");

                            System.out.println("Ingrese el nombre del empleado: ");
                            String employeeName = scanner.nextLine();

                            System.out.println("Ingrese el tipo de vehiculo (Moto/Carro): ");
                            String vehicleName = scanner.nextLine();

                            int vehicleType;
                            if (vehicleName.equalsIgnoreCase("moto")) {
                                vehicleType = 0;
                            }else{
                                vehicleType = 1;
                            }

                            System.out.println("Ingrese la marca del vehiculo: ");
                            String vehicleBrand = scanner.nextLine();

                            System.out.println("Ingrese el modelo del vehiculo: ");
                            String vehicleModel = scanner.nextLine();

                            System.out.println("Ingrese el año del vehiculo: ");
                            String vehicleYear = scanner.nextLine();

                            System.out.println("Ingrese el estado del vehiculo (Pendiente, En reparacion, Reparado):");
                            String vehicleState = scanner.nextLine();

                            taller.jodsDo(i, employeeName, vehicleType, new vehiculos(vehicleBrand, vehicleModel, vehicleYear, vehicleState));
                        }
                    } else {
                        System.out.println("No hay empleados disponibles para el trabajo.");
                    }
                    break;

                case 2:
                    if (taller.verify_jobs() > 0) {
                        taller.showJobs();
                    }else{
                        System.out.println("No hay vehiculos registrados.");
                    }
                    
                    break;

                case 3:
                    if (taller.verify_jobs() > 0) {
                        taller.countVehicleStates();
                    }else{
                        System.out.println("No hay trabajos registrados");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese marca del vehiculo a consultar: ");
                    String searchBrand = scanner.nextLine().toLowerCase().trim();

                    System.out.println("Ingrese modelo del vehiculo a consultar: ");
                    String searchModel = scanner.nextLine().toLowerCase().trim();

                    taller.searchVehicle(searchBrand, searchModel);
                    break;

                case 5:

                    System.out.println("Ingrese marca del vehiculo a consultar para editar estado: ");
                    searchBrand = scanner.nextLine().toLowerCase().trim();

                    System.out.println("Ingrese modelo del vehiculo a consultar para editar estado: ");
                    searchModel = scanner.nextLine().toLowerCase().trim();

                    System.out.println("Por que estado quiere remplazar? (Pendiente, Reparado, En reparacion)");
                    String stateVehicle = scanner.nextLine().toLowerCase().trim();

                    taller.editStateVehicle(searchBrand, searchModel, stateVehicle);
                    taller.showJobs();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}
