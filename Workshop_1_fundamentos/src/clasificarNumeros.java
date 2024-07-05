import java.util.Scanner;

public class clasificarNumeros {
    public void verificarNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** VERIFICACION DE NUMERO *****");

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        // Verificacion de positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }

        // Verificacion de par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        scanner.close();
    }
}
