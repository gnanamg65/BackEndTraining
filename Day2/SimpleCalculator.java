package Day2;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter the choice: 1.Addition\t2.subraction\t3.Muptiple\t4.Divide");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;

        }
    }
}
