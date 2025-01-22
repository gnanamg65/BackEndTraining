//Method Reference Constructor : Create a functional interface StudentFactory that contains a method create(String name, int marks).
// Use a constructor reference to implement this method to create Student objects.
package Day17;
@FunctionalInterface
interface StudentFactory {
    Student create(String name, int marks);
}
class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

public class ConstructorReference {
    public ConstructorReference() {
        StudentFactory factory = Student::new;
        Student student1 = factory.create("Alice", 85);
        Student student2 = factory.create("Bob", 90);
        System.out.println(student1);
        System.out.println(student2);
    }

    public static void main(String[] args) {
        ConstructorReference constructorReference=new ConstructorReference();
    }
}


