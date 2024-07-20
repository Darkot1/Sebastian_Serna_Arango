package RegistroEmpleados;

public class EmpleadoTemporal extends Empleado{

    private String endContract;
    

    public EmpleadoTemporal(String name, Integer age, Integer employeeID, Integer salary, String endContract) {

        super(name, age, employeeID, salary);
        this.endContract = endContract;
        
        
    }
    
    //METODOS GET 

    public String getEndContract() {
        return endContract;
    }


    //METODOS SET

    public void setEndContract(String endContract) {
        this.endContract = endContract;
    }


}
