import javax.naming.Name;

public class Course6Exercise2 {
    public static void main(String[] args) {


Person firstName = new Person ("Alice");
Person firstAge = new Person(23);
Person firstMarried = new Person(false);
        System.out.println("Name: %s, Age: %s, Is Married: %s ".formatted(firstName.getName() , firstAge.getAge() , firstMarried.isMarried()));

        Person secondName = new Person ("Bianca");
        Person secondAge = new Person(24);
        Person secondMarried = new Person(false);
        System.out.println("Name: %s, Age: %s, Is Married: %s ".formatted(secondName.getName() , secondAge.getAge() , secondMarried.isMarried()));

        Person thirdName = new Person ("Ramona");
        Person thirdAge = new Person(40);
        Person thirdMarried = new Person(true);
        System.out.println("Name: %s, Age: %s, Is Married: %s ".formatted(thirdName.getName() , thirdAge.getAge() , thirdMarried.isMarried()));
        }

/*    public Person(){
        Person firstPerson = new Person("Alice",23, false);
        Person secondPerson = new Person("Bianca",24, false);
        Person thirdPerson = new Person("Ramona",40, true);
        System.out.println(firstPerson.getPerson());
        System.out.println(secondPerson.getPerson());
        System.out.println(thirdPerson.getPerson());

    }*/
}
