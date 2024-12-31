//Inheritance:
//Create a class Animal with a method speak(). Derive classes Dog and Cat and override the speak() method to display appropriate sounds.
package Day2.OOPBasics;

public class Animal {
    void speak() {
        System.out.println("Animal Speaks");
    }
}
    class Dog extends Animal{
    void speak(){
        System.out.println("Bark");
    }
}
class  Cat extends Animal {
    void speak() {
        System.out.println("Meow");
    }
    public static void main(String[] args) {
 Animal c=new Cat();
 Animal d= new Dog();
 c.speak();
 d.speak();
    }
}