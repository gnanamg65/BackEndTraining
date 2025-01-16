package Day12;
import Day12.SerializableExample;
import java.io.*;
public class Person implements Serializable {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

}

