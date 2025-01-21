package Day16.StartingLetter;

import Day16.FilterEven.FilterEvenNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringStartWithLetter {
    public static void printEven(List<String> ll, Predicate<String> predicate){
        for(String value:ll){
            if(predicate.test(value)){
                System.out.println(value);
            }
        }
    }
    public static void main(String[] args) {
        FilterEvenNumber filterEvenNumber=new FilterEvenNumber();
        List<String> ll= Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        char letter='A';
        printEven(ll,(data)->data.startsWith(String.valueOf(letter)));
    }
}
