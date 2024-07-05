import java.util.Scanner;
public class ordernarNumeros {
    public void ordenarNumeros() {

        System.out.println("********* ORDENAR NUMEROS DE MENOR A MAYOR *************");

        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = scanner.nextInt();

        scanner.close();

        // Ordenar los numeros de menor a mayor
        int menor, medio, mayor;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            medio = (num2 <= num3) ? num2 : num3;
            mayor = (num2 <= num3) ? num3 : num2;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            medio = (num1 <= num3) ? num1 : num3;
            mayor = (num1 <= num3) ? num3 : num1;
        } else {
            menor = num3;
            medio = (num1 <= num2) ? num1 : num2;
            mayor = (num1 <= num2) ? num2 : num1;
        }

        // Mostrar los numeros ordenados
        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);
    }
}
