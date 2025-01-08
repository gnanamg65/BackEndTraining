//Map:
//Create a program that uses a Map to store and manage student names and their corresponding grades. Implement the following features:
//Add a student's name and grade to the map.
//Update a student's grade if the student already exists in the map.
//Retrieve a student's grade by their name.
//Display all students and their grades.
//Input Example:
//Add: {"Alice": 85, "Bob": 90, "Charlie": 88}
//Update: {"Bob": 92}
//Retrieve: "Alice"
//
//
//Output Example:
//Alice's grade: 85
//All students and grades:
//Alice: 85
//Bob: 92
//Charlie: 88
package Day10;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Alice",85);
        hashMap.put("Bob",90);
        hashMap.put("Charlie",88);
        System.out.println(hashMap);
        hashMap.replace("Bob",92);
        System.out.println(hashMap);
        System.out.println("Alice Grade is:"+hashMap.get("Alice"));
        System.out.println("All Student Grade");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
