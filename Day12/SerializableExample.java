package Day12;
import Day12.Person;
import java.io.*;
public class SerializableExample {
    public static void main(String[] args) {
        SerializableExample se = new SerializableExample();
        se.doser();
        se.dodse();
    }
    public void doser() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));
            Person person = new Person("GnanaPraksh", 20);
            out.writeObject(person);
            System.out.println("Person serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void dodse() {
        try {
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("person.txt"));
            Person person = (Person) ob.readObject();
            System.out.println(person.name);
            System.out.println(person.age);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

