//Single-Dimensional Array:
//Create a program to calculate the sum of all elements in an array.
package Day3.Array;
import java.util.*;
public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}