//Basic Interface Implementation:
//Create an interface Animal with methods eat() and sleep(). Implement this interface in classes Dog and Cat.
package Day3.Interface;
interface animal1{

    void eat();
    void sleep();
}
class dog1 implements animal1{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
class cat1 implements animal1{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
public class BasicInterface {
    public static void main(String[] args) {
        dog1 d=new dog1();
        d.eat();
        d.sleep();
        cat1 c=new cat1();
        c.eat();
        c.sleep();

    }
}
