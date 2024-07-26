package entity;

public class Student {
    //Attributes
    private int id;
    private String name;
    private int age;

    //Constructor
    //Empty
    public Student(){}
    //All
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id = " + this.id + ", name = " + this.name + ", age = " + this.age + "]";
    }

    

}
