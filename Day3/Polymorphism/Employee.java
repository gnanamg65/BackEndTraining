//Run-Time Polymorphism (Method Overriding):
//Write a program with a base class Employee that has a method calculateSalary(). Derive two classes Manager and Developer, and override the calculateSalary() method in both to display different salaries.

        package Day3.Polymorphism;
public class Employee {
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class Manager extends Employee{
    @Override
      void calculateSalary(){
        super.calculateSalary();
        System.out.println("Manager Salary:20000");
    }
}
class Developer extends Employee{
    @Override
     void calculateSalary(){
        super.calculateSalary();
        System.out.println("Developer Salary:10000");
    }
public static void main(String[] args) {
Developer developer=new Developer();
developer.calculateSalary();
Manager manager=new Manager();
manager.calculateSalary();
}
}
