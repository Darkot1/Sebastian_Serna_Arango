package classes;

public class Vehicle extends AbstractVehicles{
    //Attribute
    private String model;
    private String brand;
    private static String name = "hola";


    //Constructor
    //Empty
    public Vehicle(){

    }

    //All
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    
    //Methods
    public void move(){
        System.out.println("im Class father");
    }

    public static void status(){
        System.out.println("Funciona");
    }


    //GETTER
    public static String getName() {
    return name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    //SETTER

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

     //ToString
    @Override
    public String toString() {
        return "Vehicles [model = " + this.getModel() + ", brand = " + this.getBrand() + "]";
    }
}
