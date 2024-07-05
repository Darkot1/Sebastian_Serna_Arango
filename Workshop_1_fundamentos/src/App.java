import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 15 para escoger el problema: ");
        int numberCase = scanner.nextInt();

        switch (numberCase) {
            case 1:
                // Solucion problema 1
                Calculadora calculadora = new Calculadora();
                double resultado = calculadora.Calcular();
                System.out.println("el resultado es: " + resultado);

                break;

            case 2:
                // solucion problema 2
                VerificarEdad verificarEdad = new VerificarEdad();
                String mensaje = verificarEdad.verificarEdad();
                System.out.println(mensaje);

                break;

            case 3:
                // Solucion problema 3
                convertirKilometros convertir = new convertirKilometros();
                convertir.convertirKilometrosAMillas();

                break;

            case 4:
                // Solucion problema 4
                imc imc = new imc();
                imc.calcularIMC();

            case 5:
                // Solucion problema 5
                clasificarNumeros clasificar = new clasificarNumeros();
                clasificar.verificarNumero();
                break;

            case 6:
                // Solucion problema 6
                calcularDias calcularDias = new calcularDias();
                calcularDias.mostrarDiasDelMes();
                break;

            case 7:
                // Solucion problema 7
                CalculadoraMenu menu = new CalculadoraMenu();
                menu.mostrarMenu();
                break;

            case 8:
                // Solucion problema 8
                calificaciones calificaciones = new calificaciones();
                calificaciones.calcularPromedio();
                break;

            case 9:
                // Solucion problema 9
                añoBisiesto año = new añoBisiesto();
                año.verificarBisiesto();
                break;

            case 10:
                //Solucion problema 10
                propina propina = new propina();
                propina.calcularPropina();
                break;

            case 11:
                //Solucion problema 11
                ordernarNumeros orden = new ordernarNumeros();
                orden.ordenarNumeros();
                break;

            case 12:
                //Solucion problema 12
                horoscopo horoscopo = new horoscopo();
                horoscopo.mostrarSignoZodiaco();
                break;
            
            case 13:
                //Solucion problema 13
                viaje viaje = new viaje();
                viaje.calcularCostoViaje();
                break;

            case 14:
                // Solucion problema 14
                temperatura temperatura = new temperatura();
                temperatura.conversion();
                break;

            case 15:
                // Solucion problema 15
                clasificacion clasificarLetra = new clasificacion();
                clasificarLetra.calificacion();
                break;

            case 16:
                //Solucion problema 16
                System.out.println("Solucion problema en contruccion");
                break;

            case 17:
                //Solucion problema 17
                System.out.println("Solucion problema en contruccion");
                break;

            case 18:
                //Solucion problema 20
                System.out.println("Solucion problema en contruccion");
                break;
                
            case 19:
                //Solucion problema 20
                System.out.println("Solucion problema en contruccion");
                break;

            case 20:
                //Solucion problema 20
                System.out.println("Solucion problema en contruccion");
                break;


            default:
                System.out.println("Opcion no valida...");
                break;
        }
        scanner.close();
    }
}
