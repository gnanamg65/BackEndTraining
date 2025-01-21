package Day16.StudentGrade;

public class Student {
    private String name;
    private double grade;
    public Student(String name, double gpa) {
        this.name = name;
        this.grade = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return grade;
    }

    public void setGpa(double gpa) {
        this.grade = gpa;
    }

    @Override
    public String toString() {
        return "Student "+"name= " + name + "Grade:"+grade;
    }
}
