import java.util.Scanner;
public class calculadoraEdad {
    public void calcular(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        System.out.println("Ingrese su mes de nacimiento (1-12): ");
        int mesNacimiento = scanner.nextInt();

        System.out.println("Ingrese su día de nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        scanner.close();

        
        int anioActual = 2024;
        int mesActual = 7;
        int diaActual = 5;

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento || mesActual == mesNacimiento && diaActual < diaNacimiento) {
            edad--;
        }

        System.out.println("Tienes " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
}
