//Write a Java program that takes two numbers as input from the user and divides the first number by the second. Handle the following exceptions:
//ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
//InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
//General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."
package Day7.Exception;
import java.util.*;
public class Exceptionhandling2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric values");
        }
        catch (Exception e){
            System.out.println("An error occurred: [error message]");
        }
    }
}
