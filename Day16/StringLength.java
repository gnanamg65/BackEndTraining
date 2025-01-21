package Day16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        List<String>str= Arrays.asList("Hello", "World", "Java");
        Function<String,Integer>function=(StringOne)->StringOne.length();
        for (String value:str){
            System.out.println(  function.apply(value));
        }
    }
}
