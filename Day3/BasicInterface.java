package Day3;
interface animal{
    void eat();
    void sleep();
}
class dog implements animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
class cat implements animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

}
public class BasicInterface {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sleep();
        cat c=new cat();
        c.eat();
        c.sleep();
    }
}
