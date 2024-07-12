import java.util.Scanner;
public class numerosPrimos {
    
    public void calcularPrimos(){
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular sus numeros primos: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Numeros primos hasta " + number + " son:");
 
    }

}