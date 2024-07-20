import java.util.Scanner;

import Punto1.Biblioteca;
import Punto1.Libro;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("TALLER POO");
        System.out.println("1: prestar un libro.");
        System.out.println("2: Gestion de empleados.");
        System.out.println("3: ");
        System.out.println("4: ");
        System.out.println("5: ");
        System.out.println("6: ");
        System.out.println("7: SALIR.");
        System.out.println("Escoga el punto del taller: ");
        int option = scanner.nextInt();


        boolean menu = true;
        while (menu) {
            switch (option) {
                case 1:
                System.out.println("*******Prestamo de libros********");

                scanner.nextLine();

                System.out.println("Titulo del libro a agregar: ");
                String title = scanner.nextLine();
        
                System.out.println("Autor del libro a agregar: ");
                String author = scanner.nextLine();
        
                System.out.println("Año de publicacion del libro: ");
                int publicationYear = scanner.nextInt();
        
                scanner.nextLine();
        
        
                System.out.println("El libro esta prestado(Si/No)");
                String option1 = scanner.nextLine().toLowerCase();
                boolean provided = option1.equalsIgnoreCase("si");
        
                Libro libro = new Libro(title, author, publicationYear, provided);
                
        
                libro.mostrarInfo();
        
                System.out.println("Deseas prestar el libro? (Si/No)");
                String render = scanner.nextLine().toLowerCase();
                if (render.equalsIgnoreCase("si")) {
                    libro.prestar();
                }
        
                if ( render.equalsIgnoreCase("si")) {
                    System.out.println("Deseas devolver el libro? (Si/No)");
                    String devolver = scanner.nextLine().toLowerCase();
                    if (devolver.equalsIgnoreCase("si")) {
            
                        libro.devolver();
                    }
                }
               
        
                libro.mostrarInfo();
                biblioteca.addBook(libro);

                System.out.println("Desea ver todos los libros de la biblioteca? (Si/No)");
                String allBooks = scanner.nextLine().toLowerCase();

                if (allBooks.equalsIgnoreCase("si")) {
                    biblioteca.displayBooks();
                }

                System.out.println("Desea agregar otro libro? (Si/No)");
                String newBook = scanner.nextLine().toLowerCase();
                if (newBook.equalsIgnoreCase("si")) {
                    
                }else{
                    menu = false;
                } 

                    break;
                case 2:
                  
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:


                    break;
                case 7:
                    menu = false;
                    System.out.println("HASTA LUEGO.");
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
            
        }

        
        scanner.close();
    }
}
