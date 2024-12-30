package Day3;

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