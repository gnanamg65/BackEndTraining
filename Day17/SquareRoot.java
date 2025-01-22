//Static Method Reference Write a Java program that uses a method reference to
// a static method Math::sqrt to calculate
// the square root of a list of numbers.
package Day17;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
public class SquareRoot {
public SquareRoot(){
    List<Integer>v= Arrays.asList(1,2,3);
    for(Integer value:v) {
        DoubleFunction<Double> doubleFunction = Math::sqrt;
        Double result = doubleFunction.apply(value);
        System.out.println(result);
    }

}

    public static void main(String[] args) {
SquareRoot squareRoot =new SquareRoot();
    }
}
