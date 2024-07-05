import java.util.Scanner;

public class VerificarEdad {

    public String verificarEdad() {
        
        System.out.println("******** VERIFICA TU EDAD ********");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        if (edad >= 18) {
            return "Eres mayor de edad, felicidades.";
        } else if (edad < 18 && edad >= 0) {
            return "Eres menor de edad.";
        } else {
            return "Edad no permitida.";
        }
    }
}

