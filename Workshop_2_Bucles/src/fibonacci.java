import java.util.Scanner;
public class fibonacci {
    
    public void calcularFibonacci(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa hasta que numero quieres calcular");
        int n = scanner.nextInt();
        
        scanner.close();

        int num1 = 0, num2 = 1;

        System.out.println("Los primeros " + n + " numeros de Fibonacci son:");

        for (int i = 1; i <= n; ++i) {
            System.out.println(num1);

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
