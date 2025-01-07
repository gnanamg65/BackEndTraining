//Problem Statement: ArrayList
//Problem Statement 1: Manage a Shopping List
//Create a program that allows the user to manage a shopping list using an ArrayList. Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.
//Input Example:
//Add items: "Milk", "Eggs", "Bread", "Butter".
//Remove "Eggs".
//Output Example:
//
//Shopping List: [Milk, Bread, Butter]
package Day9;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String>ll=new ArrayList<>();
        ll.add("Milk");
        ll.add("Eggs");
        ll.add("Bread");
        ll.add("Butter");
        ll.remove(1);
        System.out.println(ll);
    }
}
