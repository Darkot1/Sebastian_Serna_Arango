package Inventario;

public class ProductoEspecifico extends Producto{
    //Attributes
    private String brand;
    private String category;

    //Constructor
    //empty
    public ProductoEspecifico(){

    }
    //all
    public ProductoEspecifico(String brand, String category) {
        this.brand = brand;
        this.category = category;
    }
    //extends
    public ProductoEspecifico(int id, String name, double price, String brand, String category) {
        super(id, name, price);
        this.brand = brand;
        this.category = category;
    }
    
    //Getters

    public String getBrand() {
        return this.brand;
    }

    public String getCategory() {
        return this.category;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    } 
    public void setCategory(String category) {
        this.category = category;
    }
    //ToString
    @Override
    public String toString() {
        return super.toString() + " ProductoEspecifico [brand = " + this.brand + ", category = " + this.category + "]";
    }

}
