package Empleados;

public class EmpleadoTemporal extends Empleado {
     //Attributes
    private int contractDuration;


    //Constructor
    //empty
    public EmpleadoTemporal(){}
    //All
    public EmpleadoTemporal(int contractDuration) {
        this.contractDuration = contractDuration;
    }


    public EmpleadoTemporal(String name, int age, int idEmployee, int salary, int contractDuration) {
        super(name, age, idEmployee, salary);
        this.contractDuration = contractDuration;
    }
    

    //Methods



    //Getters
    public int getContractDuration() {
        return this.contractDuration;
    }



    //Setters
    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }
}
