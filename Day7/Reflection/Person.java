//Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.
package Day7.Reflection;

public class Person {
    String name;
    int age;

    Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    public void personDetails(String place) {
        System.out.println("PlaceName: " + place);
    }
}
