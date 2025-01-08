//LinkedList:
//Create a program that allows the user to manage a task list using a LinkedList. Implement the following features:
//Add a task to the end of the list.
//Remove a task from the list by its name.
//Display all tasks in the list in the order they were added.
//
//Input Example:
//Add tasks: "Finish homework", "Go for a run", "Prepare dinner".
//Remove task: "Go for a run".
//Output Example:
//Task List:
//1. Finish homework
//2. Prepare dinner
package Day10;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> ll=new LinkedList();
while(true) {
    System.out.println("Add a Task:\nRemove a Task:\nDisplay Task:\nExit");
    System.out.println("Enter the Choice:");
    int n = sc.nextInt();
    sc.nextLine();
    switch (n) {
        case 1:
            System.out.println("Add the Task:");
        ll.add(sc.nextLine());
            break;
        case 2:
            System.out.println("Remove the Task:");
            ll.remove(sc.nextLine());
            break;
        case 3:
            for (String i : ll) {
                System.out.println(i);
            }
        case 4:
            sc.close();
            return;
    }
}

    }
}
