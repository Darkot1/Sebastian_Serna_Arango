import java.util.Scanner;
public class viaje {
    public void calcularCostoViaje() {

        System.out.println("********* A CUANTO SALIO TU VIAJE? *************");

        Scanner scanner = new Scanner(System.in);
        
        // Tarifa base 
        double tarifaBase = 4.0; 
        double tarifaPorKilometro = 2.4; 

      
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();
        scanner.close();

        double costoTotal = tarifaBase + (distancia * tarifaPorKilometro);

        System.out.println("El costo total del viaje es: $" + costoTotal);
    }
}
