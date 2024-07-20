import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class conteo {
   
    public void contarArrays(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que tendra el array: ");
        int amount = scanner.nextInt();
        scanner.nextLine(); 

        String[] elementos = new String[amount];

        System.out.println("Ingrese los elementos del array");

        for (int i = 0; i < amount; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            elementos[i] = scanner.nextLine();
        }

        Arrays.sort(elementos);

        HashMap<String, Integer> count = new HashMap<>();

        for (String elemento : elementos) {
            if (count.containsKey(elemento)) {
                count.put(elemento, count.get(elemento) + 1);
            } else {
                count.put(elemento, 1);
            }
        }
        System.out.println("Elementos y sus conteos:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println("Elemento: " + entry.getKey() + ", Conteo: " + entry.getValue());
        }

        scanner.close();
    }
}
    

