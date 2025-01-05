//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".
package Day6.Exception;
import  java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();

       try {
           double ans1 = num1 / num2;
            System.out.println("Division of two numbers is: " +ans1);
        }
        catch (NumberFormatException e){
            System.out.println(" Error: Please enter valid integers.");
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (Exception e){
            System.out.println("An unexpected error occurred.");
        }
        //int a=num1*num2;
        //System.out.println(a);
    }
}

