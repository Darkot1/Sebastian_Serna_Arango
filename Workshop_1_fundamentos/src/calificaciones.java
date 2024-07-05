import java.util.Scanner;

public class calificaciones {
      public void calcularPromedio() {
        System.out.println("****PROMEDIO DE TUS CALIFICACIONES*************");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera calificacion:");
        float calificacion1 = scanner.nextFloat();

        System.out.println("Ingrese la segunda calificacion:");
        float calificacion2 = scanner.nextFloat();

        System.out.println("Ingrese la tercera calificacion:");
        float calificacion3 = scanner.nextFloat();

        scanner.close();

        // Calcular el promedio
        float promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Mostrar el promedio
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Verificar si el alumno aprueba o no
        if (promedio >= 6) {
            System.out.println("Has aprobado la materia con un promedio de: " + promedio + " Felicidades.");
        } else {
            System.out.println("Has reprobado la materia con un promedio de: " + promedio + " Esfuerzate mas!!!");
        }
    }
}

