package Day8;

import java.util.LinkedList;
import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        int arr[]={1,2,3,4,5,6,7,8,9};
        for (int a:arr){
            ll.add(a);
        }
        int n=3;
        for (int i=0;i<n;i++){
            ll.addFirst(ll.removeLast());
        }
        System.out.println(ll.toString());
    }
}