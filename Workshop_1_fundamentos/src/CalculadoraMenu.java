import java.util.Scanner;

public class CalculadoraMenu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** CALCULADORA CON MENU *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }

        scanner.close();
    }

    public void sumar( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
        scanner.close();
    }

    public void restar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        scanner.close();
    }

    public void multiplicar( ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        scanner.close();
    }

    public void dividir( ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();

        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: división por cero no permitida.");
        }

        scanner.close();
    }

}

