//Random Supplier Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.
package Day17;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args){
        //IntSupplier number=()-> new Random().nextInt(100);
        Supplier<Integer>number=()->new Random().nextInt(100)+1;
        for (int i = 0; i < 5 ; i++) {
            //System.out.println(number.getAsInt());
            System.out.println(number.get());
        }
    }
}
