package controller;

import javax.swing.JOptionPane;

import entity.Author;
import model.ModelAuthor;

public class AuthorController {
    //Attributes
    ModelAuthor authorController;

    public AuthorController(){
        this.authorController = new ModelAuthor();
    }

    public void createAuthor(){

        String name = JOptionPane.showInputDialog("Ingrese el nombre el autor");

        String nationality = JOptionPane.showInputDialog("Ingrese la nacionalidad del autor");

        Author author = new Author(name, nationality);

        Author authorResult = (Author) this.authorController.create(author);

        JOptionPane.showMessageDialog(null, authorResult);
    }


    public void deleteAuthor(){

        int authorID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del autor a eliminar"));

        // Supongamos que delete retorna un booleano indicando si la eliminación fue exitosa
        boolean isDeleted = this.authorController.delete(authorID);

        if (isDeleted) {
            JOptionPane.showMessageDialog(null, "Autor eliminado con exito y todos sus libros tambien.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un autor con el ID proporcionado.");
        }

    }
}
