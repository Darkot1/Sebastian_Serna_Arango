import java.util.Scanner;
public class concidencia {
    public void buscar(){
        Scanner scanner = new Scanner(System.in);
       String[] Names = {"Sebastian", "Mateo", "Santiago", "Andres", "Mario", "Alex", "Nicolas","Antonio", "Daniel"};

       System.out.println("Ingrese el nombre a buscar:");
       String searchName = scanner.nextLine();

       boolean found = false;
       for (int i = 0; i < Names.length; i++) {
           if (Names[i].equalsIgnoreCase(searchName)) {
               System.out.println("El nombre " + searchName + " se encuentra en la posición " + i + " del array.");
               found = true;
               break;
           }
       }

       if (!found) {
           System.out.println("El nombre " + searchName + " no se encuentra en el array.");
       }

       scanner.close();
   }
    }

