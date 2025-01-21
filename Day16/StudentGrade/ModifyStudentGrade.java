package Day16.StudentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModifyStudentGrade {

    public ModifyStudentGrade() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gnana", 85));
        students.add(new Student("Prakash", 75));
        students.add(new Student("Jeeva", 55));
        students.add(new Student("Santhosh", 85));
        modifyAndPrintGrades(students, (student )->student.setGpa(student.getGpa() + 10));
    }
    public static void modifyAndPrintGrades(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
            consumer.accept(student);
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ModifyStudentGrade modifyStudentGrade=new ModifyStudentGrade();
    }
}
