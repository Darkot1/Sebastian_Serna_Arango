import java.util.Scanner;
public class tablaMultiplicar {
    
    public void calcularMultiplicacion(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para calcular su tabla de multiplicar: ");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        
    
    
    


    }   

}