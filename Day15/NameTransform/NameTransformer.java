package Day15.NameTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class NameTransformer {
    public static List<String> transformNames(List<String> names) {
        return names.stream()
                .map(name -> "Student: " + name.toUpperCase())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Gnana");
        studentNames.add("Prakash");
        studentNames.add("jeeva");
        studentNames.add("Dheena");
        System.out.println("Original names:");
        System.out.println(studentNames);
        List<String> transformedNames = transformNames(studentNames);
        System.out.println("\nTransformed names:");
        System.out.println(transformedNames);
    }
}

