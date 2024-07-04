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

        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingresa su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Dime tu numero favorito");
        double myNum = scanner.nextDouble();
        isDouble = 50.2;
        scanner.close();

        if(age >17){
            System.out.println("Eres mayor de edad");
        }else if(age == 12){
            System.out.println("Eres menor de edad...");
        }else{
            System.out.println("Eres menor de edad con "+age+" años");
        }


    switch (age) {
        case 12:
                System.out.println("El numero es 12");
                break;
        default:
            System.out.println("No es 12");
    }


    }
}


