import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Calculadora menu interactivo. ");
        System.out.println("2: Factura cliente. ");
        System.out.println("3: Calcular notas faltantes. ");
        System.out.println("4: Factura cliente y descuento. ");
        System.out.println("5: Buscar palabra en frase. ");
        System.out.println("6: Buscar conincidencias. ");
        System.out.println("7: trasnposicion de matriz. ");


        System.out.println("Ingrese el numero de problema: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                calculadora calculadora = new calculadora();
                calculadora.calcular();
                break;

            case 2:
                factura factura = new factura();
                factura.facturaCliente();
                break;

            case 3:
                calcularNotas notas = new calcularNotas();
                notas.calcularProm();
                break;

            case 4:
                factura facturaTwo = new factura();
                facturaTwo.facturaCliente();
                break;

            case 5: 
                frase frase = new frase();
                frase.buscarPalabra();
                break;

            case 6:
                concidencia buscar = new concidencia();
                buscar.buscar();

            case 7:
                TransposicionMatriz matriz = new TransposicionMatriz();
                matriz.transpuesta();


            default:
                break;
        }

        scanner.close();

    }
}
