//Ternary Operator:
//Write a program to find the largest of three numbers using the ternary operator.
package Day2.Operator;
import java .util.*;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.print("The largest value is:"+ans);
    }
}