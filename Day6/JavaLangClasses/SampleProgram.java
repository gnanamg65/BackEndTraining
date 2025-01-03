//Java Lang Classes
//
//Write a program to demonstrate the use of the following java.lang classes:
//Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.
//String - Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.
//System - Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().
package Day6.JavaLangClasses;
import java.util.*;
import java.lang.Math;
public class SampleProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("Square of value1 is:"+Math.sqrt(value1));
        System.out.println("Square of value2 is:"+Math.sqrt(value2));
        System.out.println("Power of value1 and value2 is:"+Math.pow(value1,2));
        System.out.println("Power of value2 and value1 is:"+Math.pow(value2,2));
        System.out.println("Maximum of value1 and value2 is:"+Math.max(value1,value2));
        System.out.println("Length of string is:"+str.length());
        System.out.println("Uppercase of string is:"+str.toUpperCase());
        System.out.println("Substring of string is:"+str.substring(0,3));
        Runtime rt=Runtime.getRuntime();
        long start=System.currentTimeMillis();
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
       long end=System.currentTimeMillis();
        System.out.println("Time taken to execute loop is:"+(end-start));

    }
}
