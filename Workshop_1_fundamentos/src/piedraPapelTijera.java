import java.util.Scanner;

public class piedraPapelTijera {

    public void jugarPiedraPapelTijera() {
        System.out.println("********PIEDRA, PAPEL, TIJERA*************");  
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: PIEDRA, 2: PAPEL, 3: TIJERA");
        System.out.println("Ingresa tu opcion:");
        int opcionUsuario = scanner.nextInt();

        scanner.close();

        int opcionMaquina = (int) (Math.random() * 3) + 1;

        String nombreMaquina;
        if (opcionMaquina == 1) {
            nombreMaquina = "PIEDRA";
        } else if (opcionMaquina == 2) {
            nombreMaquina = "PAPEL";
        } else {
            nombreMaquina = "TIJERA";
        }

        String nombreUsuario;
        if (opcionUsuario == 1) {
            nombreUsuario = "PIEDRA";
        } else if (opcionUsuario == 2) {
            nombreUsuario = "PAPEL";
        } else {
            nombreUsuario = "TIJERA";
        }

        System.out.println("Opcion de la maquina: " + nombreMaquina);

        if (opcionUsuario == opcionMaquina) {
            System.out.println("EMPATE, ambos sacaron: " + nombreMaquina);
        } else if (opcionUsuario == 1 && opcionMaquina == 2 || opcionUsuario == 2 && opcionMaquina == 3 || opcionUsuario == 3 && opcionMaquina == 1) {
            System.out.println("Perdiste! " + nombreMaquina + " gana a " + nombreUsuario);
        } else {
            System.out.println("Ganaste. " + nombreUsuario + " gana a " + nombreMaquina);
        }

        
    }
}
