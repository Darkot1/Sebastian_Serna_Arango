import java.util.Scanner;
public class temperatura {
    public void conversion() {

        System.out.println("********* CONVERSOR DE TEMPERATURA *************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversion que desea realizar:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Ingrese su opcion (1 o 2): ");
        int opcion = scanner.nextInt();

        float temperatura;
        float resultado;

        switch (opcion) {
            case 1: // Celsius a Fahrenheit
                System.out.print("Ingrese la temperatura en grados Celsius: ");
                temperatura = scanner.nextFloat();

                resultado = temperatura * 9 / 5 + 32;

                System.out.println(temperatura + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
                break;

            case 2: // Fahrenheit a Celsius
                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                temperatura = scanner.nextFloat();

                resultado = (temperatura - 32) * 5 / 9;

                System.out.println(temperatura + " grados Fahrenheit equivalen a " + resultado + " grados Celsius.");
                break;
            default:

                System.out.println("Opcion no valida. Por favor seleccione 1 o 2.");
                break;
        }

        scanner.close();
    }

    
}

