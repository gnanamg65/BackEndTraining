//Jump Statements:
//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).
package Day2.ProgramControl;
import java.util.*;
public class SkipMultiple {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
