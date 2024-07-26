package Empleados;

public class Persona {
    //Attributes
    private String name;
    private int age;

    //Constructor
    //empty
    public Persona(){

    }
    //All
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //ToString
    @Override
    public String toString() {
        return "Persona[name = "+ this.name+", age = "+ this.age+"]";
    }    
}
