import java.util.Scanner;
public class horoscopo {
    public void mostrarSignoZodiaco() {

        System.out.println("********* CUAL ES TU SIGNO DEL ZODIACO? *************");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de su mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el día de su nacimiento (1-31): ");
        int dia = scanner.nextInt();

        scanner.close();

        String signo = determinarSignoZodiaco(mes, dia);

        if (signo != null) {
            System.out.println("Tu signo zodiacal es: " + signo);
        } else {
            System.out.println("Fecha de nacimiento no valida.");
        }
    }
    public String determinarSignoZodiaco(int mes, int dia) {
        String signo = "";

        switch (mes) {
            case 1: // Enero
                if (dia >= 1 && dia <= 19) signo = "Capricornio";
                else if (dia >= 20 && dia <= 31) signo = "Acuario";
                break;
            case 2: // Febrero
                if (dia >= 1 && dia <= 18) signo = "Acuario";
                else if (dia >= 19 && dia <= 29) signo = "Piscis";
                break;
            case 3: // Marzo
                if (dia >= 1 && dia <= 20) signo = "Piscis";
                else if (dia >= 21 && dia <= 31) signo = "Aries";
                break;
            case 4: // Abril
                if (dia >= 1 && dia <= 19) signo = "Aries";
                else if (dia >= 20 && dia <= 30) signo = "Tauro";
                break;
            case 5: // Mayo
                if (dia >= 1 && dia <= 20) signo = "Tauro";
                else if (dia >= 21 && dia <= 31) signo = "Geminis";
                break;
            case 6: // Junio
                if (dia >= 1 && dia <= 20) signo = "Geminis";
                else if (dia >= 21 && dia <= 30) signo = "Cancer";
                break;
            case 7: // Julio
                if (dia >= 1 && dia <= 22) signo = "Cancer";
                else if (dia >= 23 && dia <= 31) signo = "Leo";
                break;
            case 8: // Agosto
                if (dia >= 1 && dia <= 22) signo = "Leo";
                else if (dia >= 23 && dia <= 31) signo = "Virgo";
                break;
            case 9: // Septiembre
                if (dia >= 1 && dia <= 22) signo = "Virgo";
                else if (dia >= 23 && dia <= 30) signo = "Libra";
                break;
            case 10: // Octubre
                if (dia >= 1 && dia <= 22) signo = "Libra";
                else if (dia >= 23 && dia <= 31) signo = "Escorpio";
                break;
            case 11: // Noviembre
                if (dia >= 1 && dia <= 21) signo = "Escorpio";
                else if (dia >= 22 && dia <= 30) signo = "Sagitario";
                break;
            case 12: // Diciembre
                if (dia >= 1 && dia <= 21) signo = "Sagitario";
                else if (dia >= 22 && dia <= 31) signo = "Capricornio";
                break;
        }

        return signo;
    }  
}
