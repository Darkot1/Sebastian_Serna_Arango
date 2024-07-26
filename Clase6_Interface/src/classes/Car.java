package classes;

public class Car extends Vehicle {
    //Attributes
    private Integer windows;
    
    //Constructors
    //Empty
    public Car(){

    }
    //All
    public Car(String model, String brand, Integer windows) {
        super(model, brand);
        this.windows = windows;
    }


    //Methods
    @Override
    public void move() {
        System.out.println("Car is moving with four wheels");
    }

    //GETTER
    public Integer getWindows() {
        return windows;
    }

    //SETTER
    public void setWindows(Integer windows) {
        this.windows = windows;
    }

   
   //ToString
    @Override
    public String toString() {
        return "Car [model = " + getModel() + ", brand = " + getBrand() + ", windows = " + this.windows + "]";
    }
  
  

}
