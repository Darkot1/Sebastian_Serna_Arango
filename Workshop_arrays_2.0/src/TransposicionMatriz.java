import java.util.Scanner;

public class TransposicionMatriz {
    public void transpuesta(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int rows = scanner.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz: ");
        int cols = scanner.nextInt();

        int[][] matriz = new int[rows][cols];

        System.out.println("Ingresa los elementos de la matriz: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("Elemento [" + r + "][" + c + "]: ");
                matriz[r][c] = scanner.nextInt();
            }
        }

        int[][] transpuesta = new int[cols][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                transpuesta[c][r] = matriz[r][c];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("******SIMETRIA DE MATRIZ********");

        if (rows == cols) {
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }


        scanner.close();

    }
}

