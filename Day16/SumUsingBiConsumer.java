package Day16;

import java.util.function.BiConsumer;

public class SumUsingBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>sum=(num1,num2)-> System.out.println(num1+num2);
        sum.accept(3,5);
    }
}
