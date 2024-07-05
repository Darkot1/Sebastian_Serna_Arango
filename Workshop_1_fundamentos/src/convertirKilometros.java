import java.util.Scanner;
public class convertirKilometros {
    private double kilometroMilla = 1.60934;
    Scanner scanner = new Scanner(System.in); 
    
    public void convertirKilometrosAMillas() {
        System.out.println("*****CONVERTIR KILOMETDOS A MILLAS************");

        System.out.println("Ingrese los kilometros a que quieras convertir a millas: ");
        float kilometros = scanner.nextFloat();
        scanner.close();

        double millas = kilometros / kilometroMilla;

        System.out.println("los " + kilometros + " kilometros ingresados, equivalen a: " + millas + " millas.");

}

}
