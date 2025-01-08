//Set:
//Create a program that uses a Set to store a collection of unique names. Implement the following features:
//Add names to the set.
//Check if a name is already present in the set.
//Display all unique names in the set.
//Input Example:
//Add names: "Alice", "Bob", "Alice", "Eve", "Charlie".
//Output Example:
//Unique Names: [Alice, Bob, Eve, Charlie]
package Day10;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String>ll=new HashSet<>();
        ll.add("Alice");
        ll.add("Bob");
        ll.add("Alice");
        ll.add("Eve");
        ll.add("Charlie");
        System.out.println("Unique Name is:");
        System.out.println(ll);
    }
}
