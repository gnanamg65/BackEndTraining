//Simple Supplier Write a Java program to use a Supplier that returns the current date and time.
package Day17;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        Supplier<LocalDateTime>dateAndTime=()->LocalDateTime.now();
        System.out.println(dateAndTime.get());
    }
}
