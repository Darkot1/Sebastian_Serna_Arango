package RegistroEmpleados;

public class EmpleadoPermanente extends Empleado {
    private String startContract;

    public EmpleadoPermanente(String name, Integer age, Integer employeeID, Integer salary, String startContract) {
        super(name, age, employeeID, salary);
        this.startContract = startContract;
    }
    
    //METODOS GET

    public String getStartContract() {
        return startContract;
    }

    //METODOS SET
    public void setStartContract(String startContract) {
        this.startContract = startContract;
    }

    
    
}
