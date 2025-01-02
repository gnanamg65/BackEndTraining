package Day5.AccessModifier.AnotherPackage;
import Day5.AccessModifier.PackageTwo.Employee;
import Day5.AccessModifier.PackageTwo.Person;
public class TestAccess {
    public static void main(String[] args) {;
        Person p=new Person();
        System.out.println(p.name);
        Employee employee=new Employee();
        employee.display();
    }
}
