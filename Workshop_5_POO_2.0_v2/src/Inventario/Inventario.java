package Inventario;

import java.util.ArrayList;

public class Inventario {

    //Attributes
    private ArrayList<ProductoEspecifico> productsList;

    //Constructor
    //Empty
    public Inventario(){
        this.productsList = new ArrayList<>();
    }
    //All
    public Inventario(ArrayList<ProductoEspecifico> productsList) {
        this.productsList = new ArrayList<ProductoEspecifico>(productsList);
    }


    //Methods

    public void addProduct(ProductoEspecifico product){
        this.productsList.add(product);
    }

    public void removeProduct(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == id){
                productsList.remove(i);
                break;
            }
        }
    }

    public ArrayList<ProductoEspecifico> listProducts(){
        return new ArrayList<>(this.productsList);
    }

    public ArrayList<ProductoEspecifico> searchProductsByName(String name){
        ArrayList<ProductoEspecifico> products = new ArrayList<>();
        for (ProductoEspecifico product : productsList) {
            if (product.getName().equalsIgnoreCase(name)) {
               products.add(product); 
            }
        }
        return products;
    }



    //Getters

    public ArrayList<ProductoEspecifico> getProductsList() {
        return this.productsList;
    }


    //Setters
    public void setProductsList(ArrayList<ProductoEspecifico> productsList) {
        this.productsList = productsList;
    }


    //ToString
    @Override
    public String toString() {
        return "Inventario [productsList=" + this.productsList + "]";
    }
    
}
