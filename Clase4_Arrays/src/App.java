import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        //Arreglos enteros
        //type[] name = new type[tamaño];
        int[] name = new int[2];
        name[0] = 1;
      
        //type[] name = {values};
        String[] personas = {"ana", "andres", "narciso"};

        System.out.println(personas.length);

        //Pidele al usuario 3 numeros
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros: ");

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        scanner.close();

        //FOR
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numero "+(i+1) + " " + numbers[i]);
        }


        //FOR EACH
        int cont=0;
        for (int number : numbers) {
            cont ++;
            System.out.println("numero " + cont + " " + number);

        }
        

        //MATRICES

        int[][] matriz = new int[2][3];
        
        //fila 1
        matriz[0][0] = 1;   //columna 1
        matriz[0][1] = 2;   //columna 2
        matriz[0][2] = 3;   //columna 3

        //fila 2
        matriz[1][0] = 4;   //columna 1
        matriz[1][1] = 5;   //columna 2
        matriz[1][2] = 6;   //columna 3

        for (int fila = 0; fila < 2; fila++) {
            System.out.println("fila "+  (fila +1));
            for (int col = 0; col < 3; col++) {
                System.out.println("columna " + (col+1));
            }
        }
        

        for (int[] fila : matriz) {
            for(int col: fila){
                System.out.println(col);
            }
        }


    }
}
