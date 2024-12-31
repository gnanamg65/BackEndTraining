//Parameterized Constructors:
//Create a class Student with attributes like name and age. Initialize these attributes using a parameterized constructor.
package Day2.Constructors;
import java.util.*;
public class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.print("Name"+name);
        System.out.println("Age"+age);
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Student student=new Student(sc.nextLine(),sc.nextInt());
student.display();
    }
}
