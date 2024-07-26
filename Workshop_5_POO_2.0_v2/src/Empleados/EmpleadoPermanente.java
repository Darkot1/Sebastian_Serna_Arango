package Empleados;

public class EmpleadoPermanente extends Empleado{
    //Attributes
    private String benefits;


    //Constructor
    //empty
    public EmpleadoPermanente(){}
    //All


    public EmpleadoPermanente(String benefits) {
        this.benefits = benefits;
    }


    public EmpleadoPermanente(String name, int age, int idEmployee, int salary, String benefits) {
        super(name, age, idEmployee, salary);
        this.benefits = benefits;
    }
    


    //Methods



    //Getters
    public String getBenefits() {
        return this.benefits;
    }



    //Setters
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
