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
