package Day16.PassGrade;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentPassGrade {
    public StudentPassGrade() {
        List<Student>student=new ArrayList<>();
        student.add(new Student("Gnana",85));
        student.add(new Student("Prakash",75));
        student.add(new Student("jeeva",55));
        student.add(new Student("santhosh",85));
        printEven(student,(grade)->grade.getGpa()>60);
    }
    public static void printEven(List<Student> student, Predicate<Student> predicate){
        for(Student value:student){
            if(predicate.test(value)){
                System.out.println(value);
            }
        }
    }
    public static void main(String[] args) {
        StudentPassGrade studentPassGrade=new StudentPassGrade();
    }


}
