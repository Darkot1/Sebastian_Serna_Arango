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
        System.out.println("8: Simetria de la matriz. ");
        System.out.println("9: Contar elementos de un array. ");   
        System.out.println("10: Invertir un array. ");
        System.out.println("11: consultas.");

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
                break;

            case 7:
                TransposicionMatriz matriz = new TransposicionMatriz();
                matriz.transpuesta();
                break;

            case 8:
                TransposicionMatriz matriz2 = new TransposicionMatriz();
                matriz2.transpuesta();
                break;

            case 9:
                conteo conteo = new conteo();
                conteo.contarArrays();
                break;

            case 10:

                break;

            case 11:

                System.out.println("*************CONSULTAS********************");

                System.out.println("1: Que son ArraysList. ");
                System.out.println("2: Que son MAP. ");
                System.out.println("3: Que es OPP. ");

                System.out.println("Ingrese una opcion para consultar: ");
                int opcionConsulta = scanner.nextInt();
                switch (opcionConsulta) {
                    case 1:
                        consultas consultasArrays = new consultas();
                        consultasArrays.consultasArrayslist();

                        break;

                    case 2:
                        consultas consultasMap = new consultas();
                        consultasMap.consultasMap();
                        break;

                    case 3:
                        consultas consultasOOP = new consultas();
                        consultasOOP.consultasOPP();
                        break;
                
                    default:
                    System.out.println("Opcion invalida");
                        break;
                }

            default:
                break;
        }

        scanner.close();

    }
}
