//Polymorphism:
//Implement method overloading in a class Calculator with methods to add integers, doubles, and arrays of numbers
package Day2.OOPBasics;
import java.util.*;
public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int[]arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();
        int ans1=calculator.add(sc.nextInt(), sc.nextInt());
        System.out.println("Sum of two numbers:"+ans1);
        double ans2=calculator.add(sc.nextDouble(),sc.nextDouble());
        System.out.println("Sum of two double numbers:"+ans2);
        int[] n=new int [5];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int ans3=calculator.add(n);
        System.out.println("Sum of array elements:"+ans3);
    }
}
