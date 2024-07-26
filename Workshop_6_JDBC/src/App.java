import controller.AuthorController;
import controller.BookController;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Create controllers
        AuthorController authorController = new AuthorController();
        BookController bookController = new BookController();

        boolean menu = true;
        while (menu) {
            String optionStr = JOptionPane.showInputDialog(null, 
                "****LIBRERIA*********\n"
                + "1. Agregar Autor\n"
                + "2. Eliminar Autor y sus libros\n"
                + "3. Agregar Libro\n"
                + "4. Eliminar libro\n"
                + "5. Salir\n"
                + "Seleccione una opcion:", 
                JOptionPane.QUESTION_MESSAGE);

            int option;
            try {
                option = Integer.parseInt(optionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
                continue;
            }

            switch (option) {
                case 1:
                    authorController.createAuthor();
                    break;
                case 2:
                    authorController.deleteAuthor();
                    break;
                case 3:
                    bookController.createBook();
                    break;
                case 4:
                    bookController.deleteBook();
                    break;

                case 5:
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestra libreria!");
                menu = false;
                    break;


                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
                    break;
            }
        }
    }
}
