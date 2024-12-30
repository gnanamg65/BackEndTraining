package Day3;

public class Animal {
    void sound (){
        System.out.println("Animal is Speaking");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog is Bark");
    }
}
class Cat extends Animal{
    void sound(){
        super.sound();
        System.out.println("Cat is Meow");
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sound();
        Dog dog=new Dog();
        dog.sound();
    }
}