//Problem Statement 2: Reverse the ArrayList
//Create a program that reverses the order of elements in an ArrayList.
//Input Example:
//Input list: [1, 2, 3, 4, 5]
//Output Example:
//Reversed List: [5, 4, 3, 2, 1]
package Day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        List<Integer> ll=new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        Collections.reverse(ll);
        System.out.println(ll);
    }
}
