package Day2;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int temp=n%10;
            ans =temp+ans*10;
            n/=10;

        }
        System.out.print(ans);
    }
}
