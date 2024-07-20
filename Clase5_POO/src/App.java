import java.util.Scanner;
public class App {
    //Por convencion las clases empiezan con mayuscula 
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        Pizza pizzaPiña = new Pizza();

        pizzaPiña.estadoPizza = "cruda";

        pizzaPiña.horner();

       

        System.out.println("ingrese el precio de la pizza");
        Integer nuevoPrecio = scanner.nextInt();

        pizzaPiña.setPrecio(nuevoPrecio);

        System.out.println("El precio es: " + pizzaPiña.getPrecio());

        scanner.close();

    }
}
