package Day3;
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
