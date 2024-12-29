package Day2;
import java.util.*;
public class ExitLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
            while(sc.hasNext()){
                int n=sc.nextInt();
                if(n==0) {
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }

