package RegistroEmpleados;

public class EmpleadoPermanente extends Empleado {
    private Integer yearsEmployed;


    public EmpleadoPermanente(String name, Integer age, Integer employeeID, Integer salary, Integer yearsEmployed) {
        super(name, age, employeeID, salary);
        this.yearsEmployed = yearsEmployed;
    }
    
    //METODOS GET

    public Integer getYearsEmployed() {
        return yearsEmployed;
    }

    //METODOS SET
    public void setYearsEmployed(Integer yearsEmployed) {
        this.yearsEmployed = yearsEmployed;
    }

    
    
}
