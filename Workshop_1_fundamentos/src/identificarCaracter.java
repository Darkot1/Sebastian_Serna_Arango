import java.util.Scanner;
public class identificarCaracter {
    public void caracter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("********* IDENTIFICADOR DE CARACTERES *************");
        System.out.println("");
        System.out.println("Ingrese un caracter para saber cual es: ");
        String caracter = scanner.nextLine();

        scanner.close();

        if (caracter.length() == 1) {
            switch (caracter) {
            
                case "a":
                    System.out.println("El caracter ingresado es una vocal.");
                    break;
                case "e":
                    System.out.println("El caracter ingresado es una vocal.");
                    break;
                case "i":
                    System.out.println("El caracter ingresado es una vocal.");
                    break;
                case "o":
                    System.out.println("El caracter ingresado es una vocal.");
                    break;
                case "u":
                    System.out.println("El caracter ingresado es una vocal.");
                    break;
                default:
                if(caracter.matches(".*[@#$%^&*].*")){
    
                    System.out.println("El caracter ingresado es un simbolo especial.");
                }else{
                    System.out.println("El caracter ingresado es una consonante.");
                }
            } 
        }else{
            System.out.println("Solo se puede un caracter");
        }
        

        


    }
}
