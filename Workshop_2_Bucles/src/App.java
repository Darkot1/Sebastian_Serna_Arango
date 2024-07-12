import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Numero primos: ");
        System.out.println("2: Tabla de multiplicar: ");
        System.out.println("3: Secuencia fibonacci: ");
        System.out.println("Ingresa el numero del problema que quieres: ");
        
        int option = scanner.nextInt();

        switch (option) {
            case 1:

            numerosPrimos primos = new numerosPrimos();
            primos.calcularPrimos();   
            break;

            case 2:

            tablaMultiplicar tablaMulti = new tablaMultiplicar();
            tablaMulti.calcularMultiplicacion();
             break;

            case 3:

            fibonacci fibonacci = new fibonacci();
            fibonacci.calcularFibonacci();

            break;

            case 4:
            
            rombo rombo = new rombo();
            rombo.pintar();
            break;
        
            default:
            System.out.println("Opcion no valida");
            break;
        }

        


        scanner.close();



    }
}
