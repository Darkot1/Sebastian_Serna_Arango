import java.util.Scanner;

public class calcularNotas {
    int totalNotes = 8;
    int noteMinimum = 76;

    public void calcularProm(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********CALCULADORA PROMEDIO DE NOTAS*****************");

        System.out.println("Ingrese el total de notas ya obtenidas: ");
        int notesObtained = scanner.nextInt();

        if (notesObtained > totalNotes) {
            System.out.println("EL TOTAL DE NOTAS NO PUEDEN SER MAYOR DE: " + totalNotes);
            scanner.close();
            return;
        }

        int[] notes = new int[notesObtained];
        int sumNotes = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Ingrese la calificacion " + (i + 1) + " : ");
            int note = scanner.nextInt();
            if (note > 100) {
                System.out.println("No puede ingresar una nota mayor a 100!!!");
                i--;
                continue;
            }
            notes[i] = note;
            sumNotes += notes[i];
        }

        int missingNotes = totalNotes - notesObtained;
        int approve = noteMinimum * totalNotes;
        int notesNecessary = approve - sumNotes;

        if (notesNecessary <= 0) {
            System.out.println("Ya alcanzaste el promedio para pasar el curso. ¡Felicidades!");
        } else {
            double averageNecessary =  notesNecessary / missingNotes;
            if (averageNecessary > 100) {
                System.out.println("No es posible aprobar el curso, incluso con notas perfectas en las faltantes.");
            } else {
                System.out.printf("Necesitas un promedio de " +averageNecessary+  " en las " +missingNotes+ " notas faltantes para aprobar el curso.");
        }
        scanner.close();
        }

    }
}