package Day2;
import java.util.*;
public class Employee {
    private String id;
     private String name;
    private double salary;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee();
        employee.setId(sc.nextLine());
        employee.setName(sc.nextLine());
        employee.setSalary(sc.nextDouble());
        System.out.println("Employee Id:"+employee.getId());
        System.out.println("Employee Name:"+employee.getName());
        System.out.println("Employee salary:"+employee.getSalary());

    }
}
