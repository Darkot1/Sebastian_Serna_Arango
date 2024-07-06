import java.util.Scanner;
public class contraseña {
    
    public void verificarContraseña(){
        System.out.println("********* VERIFICAR CONTRASEÑA *************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        scanner.close();
        
            int longitud = contraseña.length();

            if(longitud >= 8 && longitud <= 16){
                if(contraseña.matches(".*[a-z].*") && contraseña.matches(".*[A-Z].*") && contraseña.matches(".*[@#$%^&*].*")){
                    System.out.println("Contraseña segura");
                }else{
                    System.out.println("Contraseña débil");
                }
            }else{
                System.out.println("Contraseña demasiado corta o larga");
            }
    }
    
public class nose {
    public void iraPues(){
        System.out.println("xd");
    }
    
}

}

