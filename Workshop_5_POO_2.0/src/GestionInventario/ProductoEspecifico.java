package GestionInventario;

import java.util.Scanner;

public class ProductoEspecifico extends Producto {

    private String category;
    private String brand;

    Scanner scanner = new Scanner(System.in);

    public ProductoEspecifico() {
        super();
    }

    public ProductoEspecifico(Integer id, String name, Integer price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void productDescription() {

        System.out.println("Ingrese el id del producto: ");
        setId(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Ingrese nombre del producto: ");
        setName(scanner.nextLine());

        System.out.println("Ingrese el precio del producto: ");
        setPrice(scanner.nextInt());

        scanner.nextLine();
        
        System.out.println("Ingrese la categoria del producto: ");
        setCategory(scanner.nextLine());

        System.out.println("Ingrese la marca del producto: ");
        setBrand(scanner.nextLine());

        
    }

    public void displayProduct() {
        super.displayProduct();

        System.out.println("Categoria: " + getCategory());

        System.out.println("Marca: " + getBrand());
    }
}
