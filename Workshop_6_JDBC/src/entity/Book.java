package entity;



public class Book {
    //Attributes
    private int id;
    private String title;
    private int yearOfPublication;
    private int AuthorId;

    //Constructor
    //Empty
    public Book(){}
    //with parameters
    public Book(int id, String title, int yearOfPublication, int AuthorId){
        this.id = id;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.AuthorId = AuthorId;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getAuthorId() {
        return AuthorId;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    //ToString
    @Override
    public String toString() {
        return "Book [id = " + id + ", title = " + title + ", yearOfPublication = " + yearOfPublication + ", AuthorId = "
                + AuthorId + "]";
    }

    




}
