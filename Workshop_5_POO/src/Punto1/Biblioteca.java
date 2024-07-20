package Punto1;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }


    public void addBook(Libro libro){
        libros.add(libro);
        System.out.println("Se agrego el libro a la biblioteca.");

    }

    public void removeBook(Libro libro){
        libros.remove(libro);
        System.out.println("Se elimino el libro de la biblioteca.");
    }

    public void displayBooks(){
        for(Libro libro : libros){
            libro.mostrarInfo();
        }
    }

}


