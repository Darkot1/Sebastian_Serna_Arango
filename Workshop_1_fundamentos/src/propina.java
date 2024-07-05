import java.util.Scanner;
public class propina {
    public void calcularPropina() {

        System.out.println("********* CUANTA PROPINA DEBES DE DAR? *************");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina que desea dejar (%): ");
        double porcentajePropina = scanner.nextDouble();

        scanner.close();

        // Calcular la propina
        double propina = totalCuenta * (porcentajePropina / 100);

        // Mostrar la propina a dejar
        System.out.println("Debe dejar $" + propina + " de propina.");
    }
}
