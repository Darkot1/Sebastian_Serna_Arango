package GestionInventario;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public void addProduct(Producto producto) {
        productos.add(producto);
        System.out.println("Se agrego el producto: "+producto.getName() + " con ID: "+producto.getId());
        System.out.println();
    }

    public void removeProduct(Integer id) {
        Producto productDeleted = null;

        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productDeleted = producto;
                break;
            }
        }

        if (productDeleted != null) {
            productos.remove(productDeleted);
            System.out.println("Se elimino el producto: " + productDeleted.getName() + " con ID: " + productDeleted.getId());
            System.out.println();
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
            System.out.println();
        }
    }

    public void showProducts(){
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            System.out.println();
        }else{
            for (Producto producto : productos) {
                producto.displayProduct();
                System.out.println("------------------------------------");
            }
        }   
    }

    public void searchProductByName(String name) {
        for (Producto producto : productos) {
            if (producto.getName().equalsIgnoreCase(name)) {
                producto.displayProduct();
                System.out.println("------------------------------------");
            }
        }
    }


    public Producto getProductById(Integer id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }


}
