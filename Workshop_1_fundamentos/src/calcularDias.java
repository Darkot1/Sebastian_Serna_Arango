import java.util.Scanner;

public class calcularDias {
    public void mostrarDiasDelMes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** DiAS DEL MES *****");
        System.out.print("Ingrese el numero de un mes (1-12): ");
        int mes = scanner.nextInt();

        int dias;
        String nombre;

        switch (mes) {
            case 1:
                dias = 31;
                nombre = "Enero";
                break;
            case 2:
                dias = 28;
                nombre = "Febrero";
                break;
            case 3:
                dias = 31;
                nombre = "Marzo";
                break;
            case 4:
                dias = 30;
                nombre = "Abril";
                break;
            case 5:
                dias = 31;
                nombre = "Mayo";
                break;
            case 6:
                dias = 30;
                nombre = "Junio";
                break;
            case 7:
                dias = 31;
                nombre = "Julio";
                break;
            case 8:
                dias = 31;
                nombre = "Agosto";
                break;
            case 9:
                dias = 30;
                nombre = "Septiembre";
                break;
            case 10:
                dias = 31;
                nombre = "Octubre";
                break;
            case 11:
                dias = 30;
                nombre = "Noviembre";
                break;
            case 12:
                dias = 31;
                nombre = "Diciembre";
                break;
            default:
                dias = 0;
                nombre = "Desconocido";
                break;
        }

        scanner.close();

        if (dias != 0) {
            System.out.println("El mes " + nombre + " tiene " + dias + " días.");
        } else {
            System.out.println("Nmero de mes no valido.");
        }
    }
}

