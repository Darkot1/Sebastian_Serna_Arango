import java.util.Scanner;
public class añoBisiesto {
    public boolean esBisiesto(int año) {

        // Reglas para determinar si un año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void verificarBisiesto() {

        System.out.println("********* AÑOS BISIESTOS *************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        int año = scanner.nextInt();

        scanner.close();

        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

   
    
}
