//Interface Inheritance:
//Define an interface Vehicle with a method start(). Derive two interfaces FourWheeler and TwoWheeler from it, each adding its specific methods. Implement these in relevant classes.
package Day3.Interface;
interface vehical{
    void start();
}
interface FourWheeler{
    void numberofwheel();
}
interface twowheeler{
    void numberofwheel();
}
class car implements FourWheeler{
    public void start(){
        System.out.println("Car is starting");
    }
    public void numberofwheel(){
        System.out.println("Car has 4 wheels");
    }
}
class bike implements twowheeler{
    public void start(){
        System.out.println("Bike is starting");
    }
    public void numberofwheel(){
        System.out.println("Bike has 2 wheels");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.numberofwheel();
        bike b=new bike();
        b.start();
        b.numberofwheel();
    }
}
