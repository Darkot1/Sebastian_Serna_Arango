import java.util.Scanner;

import GestionInventario.Inventario;
import GestionInventario.ProductoEspecifico;
import RegistroEmpleados.GestionEmpleados;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        

        boolean menu = true;
        while (menu) {
            System.out.println("1: Gestion de inventario.");
            System.out.println("2: Registro de empleados.");
            System.out.println("3: Gestion de cursos.");
            System.out.println("4: Salir.");
            System.out.println("Seleccione un punto del taller: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                boolean inventarioMenu = true;
                    while (inventarioMenu) {
                        System.out.println("1: Agregar producto.");
                        System.out.println("2: Eliminar producto.");
                        System.out.println("3: Buscar producto por nombre.");
                        System.out.println("4: Buscar producto por categoría.");
                        System.out.println("5: Mostrar todos los productos.");
                        System.out.println("6: Volver al menu principal.");
                        System.out.println("Seleccione una opcion del menú de inventario: ");

                        int inventarioOpcion = scanner.nextInt();
                        scanner.nextLine();  

                        switch (inventarioOpcion) {
                            case 1:
                                ProductoEspecifico producto = new ProductoEspecifico();
                                producto.productDescription();
                                inventario.addProduct(producto);
                                break;
                            case 2:
                                System.out.println("Ingrese el ID del producto a eliminar: ");
                                int idDelete = scanner.nextInt();
                                inventario.removeProduct(idDelete);

                                break;
                            case 3:
                                System.out.println("Ingrese el nombre del producto a buscar: ");
                                String search_name = scanner.nextLine();
                                inventario.searchProductByName(search_name);

                                break;
                            case 4:
                                System.out.println("Ingrese la categoria del producto a buscar: ");
                                
                               

                                break;
                            case 5:
                                inventario.showProducts();
                                break;
                            case 6:
                                inventarioMenu = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;
                
                case 2:

                boolean empleadoMenu = true;
                while (empleadoMenu) {
                    System.out.println("1: Agregar Empleado.");
                    System.out.println("2: Ver empleados Temporales.");
                    System.out.println("3: Ver empleados Permanentes");
                    System.out.println("4: Volver al menu principal.");
                    System.out.println("Seleccione una opcion del menú de empleados: ");

                    int empleadoOpcion = scanner.nextInt();
                    scanner.nextLine();  

                    switch (empleadoOpcion) {
                        case 1:
                            GestionEmpleados gestionEmpleados = new GestionEmpleados();
                            gestionEmpleados.aggEmployee();
                            break;
                        case 2:
                            

                            break;
                        case 3:
                            

                            break;
                        case 4:
                            empleadoMenu = false;

                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                }

                    break;

                case 3:

                    break;

                case 4:
                    menu = false;
                    System.out.println("Hasta pronto :)");
                    break;
            
                default:
                System.out.println("Opcion invalida");
                    break;
            }

        }



        scanner.close();
    }
}
