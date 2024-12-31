//Create a class Vehicle with a method start(). Derive a class Car that overrides the start() method. Write a program to demonstrate method overriding.
package Day3.Inheritance;

public class Vehical {
    void start(){
        System.out.println("Vehical is starting");
    }
}
class Car extends Vehical{
    void start(){
        super.start();
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.start();
    }
}