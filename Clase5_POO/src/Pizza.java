public class Pizza {
    /***********************************ASTRACCION**************************************** */

    private Integer precio = 10; //Long, BigDecimal
    public String ingredientes;
    public String tipoMasa;
    public String estadoPizza; //cruda - horneado

    public void horner(){
        
        if (this.estadoPizza.equals("cruda")) {
            //Hornear pizza
            this.estadoPizza = "horneado";
           
        }else{
            System.out.println("La pizza no pudo ser horneada");
        }

        
    }
    

    Integer getPrecio(){
        return this.precio;
    }

    void setPrecio(Integer nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
