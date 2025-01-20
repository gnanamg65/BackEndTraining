package Day15.NameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + '}';
    }
}
public class NameFilter {
    public static List<Student> findStudentsWithNamesStartingWith(List<Student> students, char letter) {
        return students.stream()
                .filter(student -> student.getName().startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Akash", 6.5));
        students.add(new Student("Aathi", 7.8));
        students.add(new Student("Balu", 8.2));
        students.add(new Student("Dhanush", 6.9));
        students.add(new Student("ramesh", 7.7));
        char letter = 'A';
        List<Student> filteredStudents = findStudentsWithNamesStartingWith(students, letter);
        System.out.println("Students whose names start with '" + letter + "':");
        filteredStudents.forEach(System.out::println);
    }
}
