import classes.Car;
import classes.Vehicle;
import enums.Model;


public class App {
    public static void main(String[] args){

        Vehicle vehicles = new Vehicle("2015", "audi");

        Car car = new Car(vehicles.getModel(), vehicles.getBrand(), 4);

        System.out.println(car);

        vehicles.status();

        System.out.println(vehicles.getName());

        
   

        Model model = Model.M2010;

        System.out.println(model);
        
    }
}
