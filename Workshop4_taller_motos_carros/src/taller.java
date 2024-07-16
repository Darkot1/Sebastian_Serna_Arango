import java.util.HashMap;
import java.util.Map;

public class taller {

    private String[][][] tallerMatriz;
    private Map<Integer, String> employees;     

    public taller(int maxEmployees){
        this.tallerMatriz = new String[maxEmployees][2][4];
        this.employees = new HashMap<Integer, String>();
    }

    public void jodsDo(int jobsNumber, String employeerName , int vehicleType, vehiculos vehiculos){
            employees.put(jobsNumber, employeerName);
            tallerMatriz[jobsNumber][vehicleType][0]= vehiculos.getBrand();
            tallerMatriz[jobsNumber][vehicleType][1]= vehiculos.getModel();
            tallerMatriz[jobsNumber][vehicleType][2]= vehiculos.getYear();
            tallerMatriz[jobsNumber][vehicleType][3]= vehiculos.getState();
        
    }

    public void showJobs(){
        System.out.println("Agenda de trabajos:");
        System.out.println();
        System.out.println("|  Empleado |  Tipo |  Marca  | Modelo |  Año |    Estado   |");
        System.out.println("|-----------|-------|---------|--------|------|-------------|");

        for (int i = 0; i < tallerMatriz.length; i++) {

            String[][] vehicles = tallerMatriz[i];

            for (int j = 0; j < vehicles.length; j++) {
                
                if (vehicles[j][0] != null) {
                    String typeVehicle;
                    if (j == 0) {
                        typeVehicle = "Moto";
                    }else{
                        typeVehicle = "Carro";
                    }
                    System.out.println("|   " + employees.get(i) +"  | "+typeVehicle+" | "+vehicles[j][0]+ "  |  "+vehicles[j][1]+"  |  "+vehicles[j][2]+"  |  "+vehicles  [j][3]+"   |");
                }
            }
        }
    }

    public void countVehicleStates() {
        int pending = 0, repairing = 0, repaired = 0;
        for (int i = 0; i < tallerMatriz.length; i++) {
            for (int j = 0; j < 2; j++) {

                if (tallerMatriz[i][j][3] != null) {
                    
                    switch (tallerMatriz[i][j][3].toLowerCase()) {
                        case "pendiente":
                            pending++;
                            break;
                        case "en reparacion":
                            repairing++;
                            break;
                        case "reparado":
                            repaired++;
                            break;
                    }
                    
                }
            }
        }
        System.out.println("Estados de los vehiculos:");
        System.out.println("Pendiente: " + pending);
        System.out.println("En reparacion: " + repairing);
        System.out.println("Reparado: " + repaired);
    }

    public int verify_jobs() {
        int count = 0;
        for (int i = 0; i < tallerMatriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (tallerMatriz[i][j][0] != null) {
                    count++;
                }
            }
        }
        return count;
    }


    public void searchVehicle(String searchBrand, String searchModel){

        boolean found = false;
        for (int i = 0; i < tallerMatriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (searchBrand.equalsIgnoreCase(tallerMatriz[i][j][0]) && searchModel.equalsIgnoreCase(tallerMatriz[i][j][1])) {
                    
                    System.out.println("La marca del vehiculo es: " + tallerMatriz[i][j][0] );
                    System.out.println("La modelo del vehiculo es: " + tallerMatriz[i][j][1] );
                    System.out.println("el año del vehiculo es: " + tallerMatriz[i][j][2] );
                    System.out.println("el estado del vehiculo es: " + tallerMatriz[i][j][3] );
                    found = true;
                }
            }
            if (found != true) {
                System.out.println("No se ha registrado un vehiculo marca "+searchBrand +" y modelo "+searchModel);
            }
        }
       
    }

    public void editStateVehicle(String searchBrand, String searchModel, String newState) {
        boolean found1 = false;
        for (int i = 0; i < tallerMatriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (searchBrand.equalsIgnoreCase(tallerMatriz[i][j][0]) && searchModel.equalsIgnoreCase(tallerMatriz[i][j][1])) {
                    if (!newState.equalsIgnoreCase(tallerMatriz[i][j][3])) {
                        tallerMatriz[i][j][3] = newState;
                        System.out.println("El estado del vehiculo ha sido modificado a: " + newState);
                    } else {
                        System.out.println("El vehiculo ya tiene ese estado.");
                    }
                    found1 = true;
                }
            }
        }
        if (!found1) {
            System.out.println("No se encontro un vehiculo marca " + searchBrand + " y modelo " + searchModel + " para modificar el estado.");
        }
    }




}

