import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PROBLEMAS FUNDAMENTOS JAVA");
        System.out.println("1: Calculadora Básica.");
        System.out.println("2: Verificador de Edad.");
        System.out.println("3: Conversor de Unidades.");
        System.out.println("4: Calculadora de Índice de Masa Corporal (IMC).");
        System.out.println("5: Clasificador de Números. ");
        System.out.println("6: Calculadora de Días del Mes. ");
        System.out.println("7: Menú Interactivo. ");
        System.out.println("8: Cálculo de Promedio. ");
        System.out.println("9: Calculadora de Año Bisiesto. ");
        System.out.println("10: Calculadora de Propina. ");
        System.out.println("11: Ordenando Tres Números. ");
        System.out.println("12: Generador de Horóscopo. ");
        System.out.println("13: Calculadora de Tarifa de Taxi. ");
        System.out.println("14: Convertidor de Temperatura. ");
        System.out.println("15: Sistema de Calificaciones. ");
        System.out.println("16: Contraseña segura. ");
        System.out.println("17: Identificador de carácter. ");
        System.out.println("18: Juego de piedra, papel o tijera:. ");
        System.out.println("Digita el numero del problema que quieras ver: ");
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
                contraseña contraseña = new contraseña();
                contraseña.verificarContraseña();
                break;

            case 17:
                //Solucion problema 17
                identificarCaracter caracter = new identificarCaracter();
                caracter.caracter();
                break;

            case 18:
                //Solucion problema 18
                piedraPapelTijera piedraPapelTijera = new piedraPapelTijera();
                piedraPapelTijera.jugarPiedraPapelTijera();
                break;
                
            case 19:
                //Solucion problema 19
                calculadoraEdad edad = new calculadoraEdad();
                edad.calcular();
                break;

            case 20:
                //Solucion problema 20
                cifradoCesar cifrado = new cifradoCesar();
                cifrado.Cifrar();
                break;


            default:
                System.out.println("Opcion no valida...");
                break;
        }
        scanner.close();   
    }
}
