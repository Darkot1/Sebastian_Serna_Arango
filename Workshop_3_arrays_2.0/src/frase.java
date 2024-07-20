import java.util.Scanner;
public class frase {
    public void buscarPalabra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************BUSCANDO LA PALABRA**********************");

        System.out.println("Ingrese su frase: ");
        String fraseString = scanner.nextLine();

        System.out.println("Ingrese la palabra a buscar: ");
        String palabraString = scanner.nextLine();
        scanner.close();

        int posicion = fraseString.toLowerCase().indexOf(palabraString.toLowerCase());

        if(posicion == -1){
            System.out.println("La palabra no se encuentra en la frase.");
        } else {
            System.out.println("La palabra se encuentra en la posicion: " + posicion);
        }
    }
}
