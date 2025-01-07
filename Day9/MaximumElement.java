//Problem Statement 3: Find the Maximum Element in an ArrayList
//Create a program to find the maximum element in an ArrayList of integers.
//Input Example:
//Input list: [15, 22, 8, 42, 17]
//Output Example:
//Maximum Element: 42
package Day9;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ll = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
//        int max = Integer.MIN_VALUE;
//        for(int i : ll){
//            max = Math.max(max , i);
//        }

        Collections.sort(ll);

        //System.out.println(max);
        System.out.println(ll.get(ll.size()-1));
    }
}
