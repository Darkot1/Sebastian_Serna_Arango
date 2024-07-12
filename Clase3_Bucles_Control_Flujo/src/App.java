import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        abc.toCharArray();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu frase a cifrar:");
        String frase = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese su clave (en número):");
        int clave = scanner.nextInt();

        scanner.close();

        String mensajeCifrado = cifrar(frase, clave, abc);
        System.out.println("Mensaje Cifrado: " + mensajeCifrado);
    }

    // Método para cifrar el mensaje
    public static String cifrar(String mensaje, int desplazamiento, String abecedario) {
        char[] cifrado = new char[mensaje.length()];

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            int posicionOriginal = abecedario.indexOf(caracter);
            int nuevaPosicion = (posicionOriginal + desplazamiento) % abecedario.length();
            cifrado[i] = abecedario.charAt(nuevaPosicion);
        }
        return new String(cifrado);
}
}
