import java.util.ArrayList;
import java.util.Scanner;

public class factura {

    String[] products = {"Arroz","Maiz","Carne","Leche","Aceite","Frijol","Huevos","sal","harina"};
    int[] Price = {90,80,120,300,220,95,120,5,15};

    ArrayList<String> clientProducts = new ArrayList<>();
    ArrayList<Integer> clientPrices = new ArrayList<>();

    public void facturaCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********FACTURA VIRTUAL********************");
        
        boolean buying = true;

        System.out.println("PRODUCTOS DISPONIBLES");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " - precio: $ " +Price[i]);
        }

        while (buying) {
            System.out.println("Que producto deseas comprar?  o 'salir' para terminar):");
            String optionClient = scanner.next();

            if (optionClient.equalsIgnoreCase("salir")) {
                buying = false;
            }else{
                boolean look = false;
                for (int i = 0; i < products.length; i++) {
                    if (products[i].equalsIgnoreCase(optionClient)) {
                        clientProducts.add(products[i]);
                        clientPrices.add(Price[i]);
                        System.out.println("PRODUCTO AGREGADO: " + products[i]);
                        look = true;
                        break;
                        
                    }
                    
                }
                if(!look){
                    System.out.println("Producto no existe: ");
                }
            }

        }

        int total = 0;

        System.out.println("****************SU FACTURA*********************");
        for (int i = 0; i < clientProducts.size(); i++) {
            System.out.println(clientProducts.get(i) + " - precio: $ " + clientPrices.get(i) );
            total += clientPrices.get(i);
        }
        
        System.out.println("TOTAL A PAGAR: $ " + total +" dolares");

        System.out.println("**************SU DESCUENTO**********************");
        if (total >= 1000) {

            System.out.println("Su descuento es del 25% ");
            double Descuento25 = (total*25)/100;

            System.out.println("SU DESCUENTO ES DE: " + Descuento25+ " dolares");
            System.out.println("TOTAL CON DESCUENTO: " +(total-Descuento25) + " dolares");

        }else if(total < 999 && total >= 500){

            System.out.println("Su descuento es del 20% ");
            double Descuento20 = (total*20)/100;

            System.out.println("SU DESCUENTO ES DE: " + Descuento20+ " dolares");
            System.out.println("TOTAL CON DESCUENTO: " +(total-Descuento20) + " dolares");

        }else if (total < 499 && total >=300) {
            System.out.println("Su descuento es del 15% ");
            double Descuento15 = (total*15)/100;

            System.out.println("SU DESCUENTO ES DE: " + Descuento15+ " dolares");
            System.out.println("TOTAL CON DESCUENTO: " +(total-Descuento15) + " dolares");

        }else if (total <299 && total >= 200) {

            System.out.println("Su descuento es del 10% ");
            double Descuento10 = (total*10)/100;

            System.out.println("SU DESCUENTO ES DE: " + Descuento10 + " dolares");
            System.out.println("TOTAL CON DESCUENTO: " +(total-Descuento10) + " dolares");
            
        }else{

            System.out.println("NO SE APLICA DESCUENTO");
            System.out.println("SU TOTAL ES: " +total);
        }

        scanner.close();
    }
}
