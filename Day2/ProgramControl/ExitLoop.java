//Create a program to exit a loop if the user enters the number 0 (use break).
package Day2.ProgramControl;
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

