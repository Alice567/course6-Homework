//1) create an object that represents a Person
public class Person {
    private String name;
    private Integer age;
    private Boolean married;

    //2) create an application that creates 3 persons using the objects from exercise 1. Print them to the console
    public Person(String name){
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(boolean married){
        this.married=married;
    }
   /* public Person(String name,int age, boolean married){
this.name=name;
this.age=age;
this.married=married;
    }*/
   String getName() {
    return this.name;
    }
    public Integer getAge() {
    return this.age;
    }
    public Boolean isMarried() {
    return this.married;
    }
   /* public String getPerson(){
        return "Name: %s , Age: %s Is Married:%s ".formatted(this.name, this.age,this.married);
    }*/
}

