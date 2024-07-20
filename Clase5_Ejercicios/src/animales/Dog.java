package animales;

public class Dog extends Animal{
    
    public Dog(String type, String name) {
        super(type, name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
