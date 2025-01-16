package Day12;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
public class Student implements Externalizable {
    private String name;
    private transient int age; // Marked transient to exclude from default serialization

    // No-argument constructor (required by Externalizable)
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age); // Write age
        out.writeUTF(name); // Write name
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt(); // Read age
        name = in.readUTF(); // Read name
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}