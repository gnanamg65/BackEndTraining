package Day2;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%400==0||( num%100!=0&& num%4==0)){
            System.out.println("leap Year:"+num);
        }
        else{
            System.out.println("not a leapYear:"+num);
        }
    }
}
