//Bitwise Operators:
//Write a program to swap two numbers without using a third variable (use XOR).
package Day2.Operator;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Before Swapping:num1="+num1+":num2="+num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After Swapping:num1="+num1+":num2="+num2);
    }
}
