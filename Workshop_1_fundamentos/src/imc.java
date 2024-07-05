import java.util.Scanner;
public class imc {
    
    public void calcularIMC(){

        System.out.println("********* CALCULADORA DE MASA CORPORAL (IMC) *************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        float peso = scanner.nextFloat();

        System.out.println("Ingrese su altura en metros: ");
        float altura = scanner.nextFloat();
        scanner.close();

        float imc = peso / (altura * altura);

        System.out.println("Su IMC es de: " + imc);
    }
}
