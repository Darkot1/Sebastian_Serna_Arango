import java.util.Scanner;

import GestionCursos.Curso;
import GestionCursos.Estudiante;
import GestionCursos.GestionCurso;
import GestionInventario.Inventario;
import GestionInventario.ProductoEspecifico;
import RegistroEmpleados.GestionEmpleados;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        GestionEmpleados gestion = new GestionEmpleados();
        GestionCurso gestionCurso = new GestionCurso();

        menu optioMenu = new menu();

        boolean menu = true;
        while (menu) {

            optioMenu.menuPrincipal();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    boolean inventarioMenu = true;
                    while (inventarioMenu) {

                        optioMenu.menuInventario();
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

                        optioMenu.menuEmpleado();
                        int empleadoOpcion = scanner.nextInt();
                        scanner.nextLine();

                        switch (empleadoOpcion) {
                            case 1:
                                gestion.addEmployee();

                                break;
                            case 2:
                                gestion.showEmployee();

                                break;
                            case 3:

                                empleadoMenu = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }

                    break;

                case 3:

                    boolean menuCursos = true;
                    while (menuCursos) {
                        optioMenu.menuCurso();
                        int cursoOpcion = scanner.nextInt();

                        switch (cursoOpcion) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("Ingrese el nombre del curso: ");
                                String courseName = scanner.nextLine();
                                

                                System.out.println("Ingrese el código del curso: ");
                                int cursoId = scanner.nextInt();

                                Curso course = new Curso(cursoId, courseName);

                                gestionCurso.addCourse(course);
                                break;

                            case 2:
                                scanner.nextLine();
                                System.out.println("Ingrese el nombre del estudiante: ");
                                String name = scanner.nextLine();

                                System.out.println("Ingrese el email del estudiante: ");
                                String email = scanner.nextLine();

                                System.out.println("Ingrese el ID del estudiante: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();

                                Estudiante student = new Estudiante(id, name, email);

                                System.out.println("Ingrese el codigo del curso para inscribirse: ");
                                int courseCode = scanner.nextInt();
                                scanner.nextLine();
                                
                                gestionCurso.enrollStudentCourse(courseCode, student);
                                break;

                            case 3:
                                gestionCurso.showCourses();
                                break;

                            case 4:
                                System.out.println("Ingrese el codigo del curso para ver los estudiantes inscritos: ");
                                int code = scanner.nextInt();
                                scanner.nextLine();

                                gestionCurso.listStudentsInCourse(code);
                                break;

                            case 5:
                                menuCursos = false;
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    }

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
