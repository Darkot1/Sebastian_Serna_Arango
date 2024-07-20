package animales;

public class Animal {

    String type;
    String name;

    //constructor con todos los atributos
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    //constructor vacio
/*     public Animal() {
    } */

    //Constructor con solo nombre
    public Animal(String name) {
        this.name = name;
    }

    //Constructor con solo tipo
 


    //metodos getters y setters
    public String getType() {
        return type;
    }

    
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void makeSound(){
        System.out.println("the "+name+" make a sound");
    }
    
    public void makeSound(String name, String type){

    }
}
