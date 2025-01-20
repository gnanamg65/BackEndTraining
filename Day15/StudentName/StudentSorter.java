package Day15.StudentName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + '}';
    }
}
public class StudentSorter {
    public static void sortStudentsByGpa(List<Student> students) {
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gnana", 7));
        students.add(new Student("prakash", 7.5));
        students.add(new Student("Akilan", 6.5));
        students.add(new Student("Dhinesh", 7.9));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        sortStudentsByGpa(students);
        System.out.println("\nAfter sorting by GPA (descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
