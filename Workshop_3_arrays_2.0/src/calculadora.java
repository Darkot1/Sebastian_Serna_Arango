import java.util.Scanner;

public class calculadora {

    public void calcular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********CALCULADORA CON MENU*******************");
        System.out.println("1: SUMAR. ");
        System.out.println("2: RESTAR. ");
        System.out.println("3: MULTIPLICAR. ");
        System.out.println("4: DIVIDIR. ");

        System.out.println("Ingrese la cantidad de operaciones que desea realizar: ");
        int n = scanner.nextInt();

        int[] opciones = new int[n];
        int[] numeros1 = new int[n];
        int[] numeros2 = new int[n];
        int[] resultados = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Seleccione la opcion que desee para la operacion " + (i + 1) + ": ");
            opciones[i] = scanner.nextInt();

            System.out.println("Ingrese el primer numero para la operacion " + (i + 1) + ": ");
            numeros1[i] = scanner.nextInt();

            System.out.println("Ingrese segundo numero para la operacion " + (i + 1) + ": ");
            numeros2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            switch (opciones[i]) {
                case 1:
                    resultados[i] = numeros1[i] + numeros2[i];
                    System.out.println("El resultado de la SUMA en la operacion " + (i + 1) + " es: " + resultados[i]);
                    break;

                case 2:
                    resultados[i] = numeros1[i] - numeros2[i];
                    System.out.println("El resultado de la RESTA en la operacion " + (i + 1) + " es: " + resultados[i]);
                    break;

                case 3:
                    resultados[i] = numeros1[i] * numeros2[i];
                    System.out.println("El resultado de la MULTIPLICACION en la operacion " + (i + 1) + " es: " + resultados[i]);
                    break;

                case 4:
                    if (numeros2[i] == 0) {
                        System.out.println("NO SE PUEDE DIVIDIR POR 0 en la operacion " + (i + 1));
                    } else {
                        resultados[i] = numeros1[i] / numeros2[i];
                        System.out.println("El resultado de la DIVISION en la operación " + (i + 1) + " es: " + resultados[i]);
                    }
                    break;

                default:
                    System.out.println("OPCION INVALIDA en la operacion " + (i + 1));
                    
                    break;
            }
        }

        scanner.close();
    }

}

