package RegistroEmpleados;

public class EmpleadoTemporal extends Empleado{

    private String startContract;
    private String endContract;
    

    public EmpleadoTemporal(String name, Integer age, Integer employeeID, Integer salary, String startContract, String endContract) {

        super(name, age, employeeID, salary);
        this.startContract = startContract;
        this.endContract = endContract;
        
        
    }
    
    //METODOS GET 
    public String getStartContract() {
        return startContract;
    }

    public String getEndContract() {
        return endContract;
    }


    //METODOS SET
    public void setStartContract(String startContract) {
        this.startContract = startContract;
    }

    public void setEndContract(String endContract) {
        this.endContract = endContract;
    }


}
