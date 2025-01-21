package Day16.FilterEven;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumber {

    public static void printEven(List<Integer> ll, Predicate<Integer> predicate){
        for(Integer value:ll){
            if(predicate.test(value)){
                System.out.println(value);
            }
        }
    }
    public static void main(String[] args) {
        FilterEvenNumber filterEvenNumber=new FilterEvenNumber();
        List<Integer> ll= Arrays.asList(12,45,22,35,60);
        printEven(ll,(data)->data%2==0);
    }
}
