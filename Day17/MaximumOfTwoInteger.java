//BinaryOperator Create a program using a BinaryOperator to find the maximum of two integers.
package Day17;
import java.util.function.BinaryOperator;
public class MaximumOfTwoInteger {
    public void StringToUpperCase(int a,int b){
        BinaryOperator<Integer> binaryOperator=(x,y)->Math.max(x,y);
        int result=binaryOperator.apply(a,b);
        System.out.println(result);
    }
    public static void main(String[] args) {
        MaximumOfTwoInteger maximumOfTwoInteger=new MaximumOfTwoInteger();
        int a=8;
        int b=9;
        maximumOfTwoInteger. StringToUpperCase(a,b);
    }
}

