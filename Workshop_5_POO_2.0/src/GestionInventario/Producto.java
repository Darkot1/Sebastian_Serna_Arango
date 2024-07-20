package GestionInventario;

import java.util.Scanner;

public class Producto {
    private Integer id;
    private String name;
    private Integer price;

    Scanner scanner = new Scanner(System.in);

    public Producto(){

    }


    public Producto(Integer id, String name, Integer price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //METODOS GET

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }


    //METODO SET

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public void displayProduct(){
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getName());
        System.out.println("Precio: " + getPrice());
    }



}


