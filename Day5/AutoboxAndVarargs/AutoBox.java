package Day5.AutoboxAndVarargs;
import java.util.*;
public class AutoBox {
    public static void main(String[] args) {
        List<Integer>ll=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        int sum=0;
        for(int val:ll){
            sum+=val;
        }
        System.out.println(sum);
    }
}
