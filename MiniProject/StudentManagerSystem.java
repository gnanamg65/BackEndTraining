package MiniProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable  {
    private int id;
    String name;
    int age;
    String grade;
    String email;

    public Student(int id, String name, int age, String grade, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setEmail(String email) { this.email = email; }

    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", grade='" + grade + '\'' + ", email='" + email + '\'' + '}';
    }
}

//-------------------------------------------------------------------------------------//


class StudentManager{
    private List<Student> students;
    private static final String FILE_NAME = "students.txt";
    public StudentManager() throws IOException, ClassNotFoundException {

        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students = loadStudentsFromFile();
    }
    private List<Student> loadStudentsFromFile() throws IOException, ClassNotFoundException {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("File not found, creating a new one...");
            saveStudentsToFile();
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        }

    }
    public void addStudent(Student student) throws IOException {
        students.add(student);
        saveStudentsToFile();
        System.out.println("Student added successfully");
    }

    private void saveStudentsToFile() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        }

    }
        public List<Student> viewAllStudents() {
            try {
                return students;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    public void searchStudentById(int id) {
        try {
            students.stream().filter(student -> student.getId() == id).forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteStudent(int id) {
        try {
            students.removeIf(student -> student.getId() == id);
            saveStudentsToFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void updateStudent(int id, String name, int age, String grade, String email) throws IOException {
        try {
            students.stream().filter(student -> student.getId() == id).forEach(student -> {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                student.setEmail(email);
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        saveStudentsToFile();
    }
    public void storedData(){
        new Thread(()->{
            System.out.println("Stored Data");
            try {
                Thread.sleep(1000);
                saveStudentsToFile();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
    public void searchGrade(String grade) {
        try {
            students.stream().filter(student -> student.getGrade().equals(grade)).forEach(System.out::println);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void sortByName(){
        System.out.println("Sorted by name");
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    public void  sortByGrade(){
        System.out.println("Sorted by grade");
        students.stream().sorted(Comparator.comparing(Student::getGrade)).forEach(System.out::println);
    }

}

//-------------------------------------------------------------------------------------//



public class StudentManagerSystem{
    static StudentManager manager;

    static {
        try {
            manager = new StudentManager();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try {
            while (true) {
                System.out.println("-------------------------");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4.Search grade");
                System.out.println("5. Update Student");
                System.out.println("6. Delete Student");
                System.out.println("7. Stored Data");
                System.out.println("8.Sort by name");
                System.out.println("9.Sort by grade");
                System.out.println("-------------------------");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> viewAllStudents();
                    case 3 -> searchStudentById();
                    case 4 -> searchGrade();
                    case 5 -> updateStudent();
                    case 6 -> deleteStudent();
                    case 7 -> storedData();
                    case 8-> sortByName();
                    case 9-> sortByGrade();
                }
            }
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }

    private static void sortByGrade() {
        manager.sortByGrade();
    }

    private static void sortByName() {
        manager.sortByName();
    }

    private static void searchGrade() {
        System.out.print("Enter the grade :");
        String grade=sc.nextLine();
       manager. searchGrade(grade);
    }

    private static void storedData() {
        manager.storedData();
        System.out.println("Data stored successfully");
        System.exit(0);

    }
    private static void addStudent() throws IOException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        if (manager.viewAllStudents().stream().anyMatch(student -> student.getId() == id)) {
            System.out.println("Student Id already exists");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine().toUpperCase();
        if(grade.length()>1){
            System.out.println("Invalid Grade");
            return;
        }
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        String str="^[A-Za-z0-9]+([.-_][A-Za-z0-9]+)*@[A-Za-z0-9.-]+\\.(com|org|net)$";
        if(email.matches(str)){
            manager.addStudent(new Student(id, name, age, grade, email));
        }
        else {
            System.out.println("Invalid Email");
        }
    }

    private static void viewAllStudents() {
            List<Student> students = manager.viewAllStudents();
            students.forEach(System.out::println);

    }
    private static void searchStudentById(){
        System.out.print("Enter the ID to search: ");
        int id = sc.nextInt();
        manager.searchStudentById(id);
    }
    private static void updateStudent() throws IOException {
        System.out.print("Enter the ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        manager.updateStudent(id, name, age, grade, email);
    }
    private static void deleteStudent() throws IOException {
        System.out.print("Enter the ID to delete: ");
        int id = sc.nextInt();
        manager.deleteStudent(id);
    }
}
