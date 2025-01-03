//Clone
//Create a class Student with fields for the name and age. Write a program to create a clone (copy) of a Student object using the clone() method.
package Day6.Clone;
public class Student implements Cloneable{
    private String name;
    private int age;
Student(String name,int age){
    this.name=name;
    this.age=age;
}
    public static void main(String[] args) {
        try{
        Student student=new Student("gnana",21);
        Student student1=(Student) student.clone();
            System.out.println("Original value:"+student.name+" "+student.age);
        System.out.println("Clone Value:"+student1.name+" "+student1.age);
    }
    catch(CloneNotSupportedException e){
        System.out.println("Clone not supported");
    }
    }

}
