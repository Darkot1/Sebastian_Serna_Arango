import animales.Animal;
import animales.Cat;

public class App {
    public static void main(String[] args){

        Punto punto = new Punto();
        PuntoDos puntoDos = new PuntoDos();

        punto.orientar();
        puntoDos.orientar();
        

        Cat cat = new Cat("gato", "michi");
        Animal animal = new Animal("vibora", "pepe");

        animal.makeSound();
        animal.makeSound();

        cat.makeSound();
        cat.makeSound();
        
        
    }
}
