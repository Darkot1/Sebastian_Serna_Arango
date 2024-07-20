package Punto1;

public class Libro {
    private String title;
    private String author;
    private Integer publicationYear;
    private boolean provided;

    public Libro(String title, String author, Integer publicationYear, boolean provided) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.provided = provided;
    }

    //METODOS GET
    public String getAuthor() {
        return author;
    }
    
    public Integer getPublicationYear() {
        return publicationYear;
    }

    public String getTitle() {
        return title;
    }

    //METODOS SET
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    
    public void prestar() {
        if (provided == false)  {
            provided = true;
            System.out.println("Prestaste el libro.");
        } else {
            System.out.println("El libro ya esta prestado.");
        }
    }

    public void devolver() {
        if (provided) {
            provided = false;
            System.out.println("Devolviste el libro.");
        } else {
            System.out.println("El libro no esta prestado.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Año de Publicacin: " + publicationYear);
        
        if (provided) {
            System.out.println("Prestado: Si");
        }else{
            System.out.println("Prestado: No");
        }
    }
}
