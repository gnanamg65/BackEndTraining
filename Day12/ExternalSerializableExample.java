package Day12;
import java.io.*;
public class ExternalSerializableExample {
    public static void main(String[] args) {
        ExternalSerializableExample example = new ExternalSerializableExample();
        example.serializeStudent();
        example.deserializeStudent();
    }
    public void serializeStudent() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            Student student = new Student("GnanaPraksh", 20);
            out.writeObject(student);
            System.out.println("Student serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deserializeStudent() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student student = (Student) in.readObject();
            System.out.println("Deserialized Student: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
