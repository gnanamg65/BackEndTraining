//Hierarchical Inheritance:
//Create a base class Animal with a method sound(). Derive two classes Dog and Cat from Animal. Override the sound() method to print “Bark” for Dog and “Meow” for Cat.

package Day3.Inheritance;

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