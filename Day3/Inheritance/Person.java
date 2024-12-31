//Basic Inheritance:
//Create a class Person with attributes name and age. Derive a class Student that adds rollNumber and marks. Write methods to display both Person and Student details.
package Day3.Inheritance;
import java.util.*;
public class Person{
    public  String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
class Student extends Person {
    public  int roolno;
    public  int marks;

    public  Student(String name, int age, int roolno, int marks) {
        super(name, age);
        this.roolno = roolno;
        this.marks = marks;
    }
    void display() {
        super.display();
        System.out.println("RoolNo:" + roolno);
        System.out.println("Marks:" + marks);
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    Student student=new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    student.display();
    }
}
