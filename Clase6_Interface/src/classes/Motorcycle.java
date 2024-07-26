package classes;

public class Motorcycle extends Vehicle{

    private boolean chain;

    //Constructor
    //Empty
    public Motorcycle(){

    }
    //All
    public Motorcycle(String model, String brand, boolean chain) {
        super(model, brand);
        this.chain = chain;
    }

    //Methods
    @Override
    public void move(){
        System.out.println("Motorcycle is moving with two wheels");
    }

    //GETTER
    public boolean isChain() {
        return chain;
    }

    //SETTER
    public void setChain(boolean chain) {
        this.chain = chain;
    }


    //ToString
    @Override
    public String toString() {
        return "Motorcycle [model = " + getModel() 
        + ", brand = " + getBrand() 
        + ", chain = " + this.chain + "]";
    }

}
