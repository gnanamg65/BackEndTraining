//UnaryOperator Write a Java program to use a UnaryOperator that converts a given string to uppercase.
package Day17;
import java.util.function.UnaryOperator;

public class StringToUpperCase {
    public void StringToUpperCase(String str){
        UnaryOperator<String> unaryOperator=(value)->value.toUpperCase();
        System.out.println(unaryOperator.apply(str));
    }

    public static void main(String[] args) {
        StringToUpperCase stringToUpperCase=new StringToUpperCase();
        String str="Gnana";
        System.out.println(str);
       stringToUpperCase. StringToUpperCase(str);
    }
}
