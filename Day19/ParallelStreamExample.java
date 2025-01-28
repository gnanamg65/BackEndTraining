package Day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 55, 60, 45, 70, 85,56, 95,78,98, 100, 120, 25, 65);
        List<Integer> result = numbers.stream().parallel()
                .filter(num -> num > 50)
                .map(num -> num * num)
                .limit(10)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}

