import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        //Primitive data type
        //Byte
        byte isByte = 100;
        short isShort = 1000;
        int isInt = 1000000;
        long isLong = 10000000000L;
        float isFloat = 100.0f;
        double isDouble = 14.45;
        char isChar = 'A';
        boolean isBoolean = false;

        System.out.println(isByte);

        int sum0 = isByte + isShort + isInt;

        long sum = isByte + isShort + isInt + isLong;

        double sum2 = isFloat*30 + isDouble;

        float sum3 = isInt + isFloat;


        System.out.println(sum0);
        System.out.println(sum);
        System.out.println(sum2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa un texto: ");
        String textInput = scanner.nextLine();

        System.out.println(userInput);
        System.out.println(textInput);
        scanner.close();





    }
}


