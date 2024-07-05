import java.util.Scanner;
public class clasificacion {
    public void calificacion() {

        System.out.println("********* CLASIFICACION DE NOTA EN LETRA *************");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificacion del examen (0-100): ");
        int calificacion = scanner.nextInt();

        scanner.close();

        char letra;

        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion <= 89) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion <= 79) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion <= 69) {
            letra = 'D';
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = 'F';
        } else {
            System.out.println("Calificacion no valida. Ingrese un valor entre 0 y 100.");
            return;
        }

        System.out.println("la nota " + calificacion + " tiene una clasificacion: " + letra);
    }
}
