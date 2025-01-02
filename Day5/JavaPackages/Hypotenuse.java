package Day5.JavaPackages;
import java.util.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Hypotenuse {
    public static void  CalculateValue(int a,int b){
        System.out.println("Hypotenuse Value is:"+sqrt(pow(a,2)+pow(b,2)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CalculateValue(sc.nextInt(),sc.nextInt());
    }
}
