//Arithmetic and Logical Operators:
//Create a program to check if a number is prime using logical operators.
package Day2.Operator;
import  java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        if(n==0||n==1){
            System.out.println("Not a Prime");
        }
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("PrimeNumder");
        }
        else{
            System.out.println("Not a PrimeNUmber");
        }
    }
}
