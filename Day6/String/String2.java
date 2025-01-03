//2) Write a program that:
//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.
package Day6.String;
import java.util.*;
public class String2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().toUpperCase();
        String str2= sc.nextLine().toUpperCase();
        System.out.println("To Compare the String:"+str1.compareTo(str2));
        System.out.println(str1.equals(str2));
        str1+=str2;
        System.out.println("Concatenate Two String:"+str1);
    }
}
