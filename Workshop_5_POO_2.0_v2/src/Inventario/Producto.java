package Inventario;

public class Producto {
    //Attribute
    private int id;
    private String name;
    private double price;


    //Constructor
    //empty
    public Producto() {
    }
    //constructor with parameters
    public Producto(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    //Getters

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Producto [id = " + this.id + ", name = " + this.name + ", price = " + this.price + "]";
    }

 




}
