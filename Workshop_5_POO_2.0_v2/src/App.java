import Inventario.Inventario;
import Inventario.ProductoEspecifico;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu de Inventario:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();  

            switch (option) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  

                    System.out.print("Ingrese el nombre del producto: ");
                    String name = scanner.nextLine();

                    System.out.print("Ingrese el precio del producto: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  

                    System.out.print("Ingrese la marca del producto: ");
                    String brand = scanner.nextLine();

                    System.out.print("Ingrese la categoría del producto: ");
                    String category = scanner.nextLine();

                    ProductoEspecifico producto = new ProductoEspecifico(id, name, price, brand, category);
                    inventario.addProduct(producto);
                    System.out.println("Producto añadido exitosamente.");
                    break;

                case 2:
                    System.out.println("\nLista de todos los productos:");
                    for (ProductoEspecifico p : inventario.listProducts()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int removeId = scanner.nextInt();
                    inventario.removeProduct(removeId);
                    System.out.println("Producto eliminado exitosamente.");
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String searchName = scanner.nextLine();
                    ArrayList<ProductoEspecifico> foundProducts = inventario.searchProductsByName(searchName);
                    if (foundProducts.isEmpty()) {
                        System.out.println("No se encontraron productos con el nombre: " + searchName);
                    } else {
                        System.out.println("Productos encontrados:");
                        for (ProductoEspecifico p : foundProducts) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Hasta luego :)");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (option != 5);

        scanner.close();
    }
}
