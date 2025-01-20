package Day15.AverageGpa;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
}
public class AverageGpaCalculator {
    public static double calculateAverageGpa(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Akilan", 7.5));
        students.add(new Student("Balu", 8.8));
        students.add(new Student("siva", 9.2));
        students.add(new Student("Dhinesh", 7.9));

        double averageGpa = calculateAverageGpa(students);
        System.out.println("The average GPA is: " + averageGpa);
    }
}
