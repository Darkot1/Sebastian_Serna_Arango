package entity;

public class Author {
    //Attributes
    private int id;
    private String name;
    private String nationality;
    //Constructors
    //empty
    public Author() {}
    //with parameters

    public Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }

    public Author(int id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }


    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //ToString
    @Override
    public String toString() {
        return "Author [id = " + id + ", name = " + name + ", nationality = " + nationality + "]";
    }

    

   
    




}


