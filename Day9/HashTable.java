/*Problem Statement: Hashtable
        Contact Directory Management System
        Create a program to manage a contact directory using a Hashtable in Java. Implement the following functionalities:
        Add contacts with the name as the key and phone number as the value.
        Search for a contact by name and display their phone number.
        Remove a contact by name.
        Display all contacts in the directory.
        Input Example:
        Add contacts: John -> 9876543210, Alice -> 9123456780, Bob -> 8899776655.
        Search for Alice.
        Remove contact Bob.
        Output Example:
        Contact Directory:
        John: 9876543210
        Alice: 9123456780
        Search Result for Alice: 9123456780
        After Removal:
        John: 98765432
        Alice: 9123456780

*/
        package Day9;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, String>table=new Hashtable<>();
        table.put("John","9876543210");
        table.put("Alice","9123456780");
        table.put("Bob","8899776655");
        System.out.println("Contact Directory:");
        System.out.println("John:"+table.get("John"));
        System.out.println("Alice:"+table.get("Alice"));
        System.out.println("search Result Of Alice :"+table.get("Alice"));
         table.remove("Bob");
        System.out.println(" After Remove:");
        for (Map.Entry<String, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
