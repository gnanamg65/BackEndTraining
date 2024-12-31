package Day3.Static;
import java.util.*;
public class Utility {
    public static void UpperCase(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UpperCase(sc.nextLine());
    }
}
