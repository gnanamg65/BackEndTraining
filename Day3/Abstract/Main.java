//Partial Implementation:
//Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract). Derive a class Fan and implement turnOn().
package Day3.Abstract;
abstract class Appliance {
    abstract void turnOn();
    void turnOff() {
        System.out.println("The appliance is turned off.");
    }
}
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("The fan is turned on.");
    }
}
public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }
}

