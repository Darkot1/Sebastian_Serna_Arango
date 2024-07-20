public class persona {
    
    // Atributos privados
    private String name;
    private int age;
    
    // Constructor
    public persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Métodos públicos para acceder a los atributos
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
