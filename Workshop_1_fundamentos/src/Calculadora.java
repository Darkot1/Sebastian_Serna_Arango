import java.util.Scanner;

public class Calculadora {
    private double num1;
    private double num2;
    private double resultado;
    
    public double Calcular() {
        

        System.out.println("*************** BIENVENIDO A LA CALCULADORA ***************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.println("¿Que deseas hacer con los numeros? 1: SUMAR, 2: RESTAR, 3: DIVIDIR, 4: MULTIPLICAR");
        int operacion = scanner.nextInt();
        scanner.close();

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: Division por cero no permitida.");
                }
                break;
            case 4:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operación no valida.");
                break;
        }

        return resultado;
    }
}

