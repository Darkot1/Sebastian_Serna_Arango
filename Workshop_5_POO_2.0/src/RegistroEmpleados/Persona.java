package RegistroEmpleados;

public class Persona {
   private String name;
   private Integer age;


public Persona(String name, Integer age) {
    this.name = name;
    this.age = age;
}

//METODOS GET

public Integer getAge() {
    return age;
}

public String getName() {
    return name;
}

//METODOS SET

public void setAge(Integer age) {
    this.age = age;
}

public void setName(String name) {
    this.name = name;
}



    


}
