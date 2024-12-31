//Compile-Time Polymorphism (Method Overloading):
//Create a class Calculator with overloaded methods add(int, int), add(double, double), and add(int, int, int). Test all methods.

package Day3.Polymorphism;
import java.util.*;
public class Calculator {
    public static void add(int a,int b){
        System.out.println("Sum of two numbers:"+(a+b));
    }
    public static void add(double a,double b){
        System.out.println("Sum of two double numbers:"+(a+b));
    }
    public static void add(int a,int b,int c){
        System.out.println("Sum of Three Number:"+(a+b+c));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        add(sc.nextInt(),sc.nextInt());
        add(sc.nextDouble(),sc.nextDouble() );
        add(sc.nextInt(), sc.nextInt(), sc.nextInt());

    }
}
