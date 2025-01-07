//Problem Statement: Vector
//Student Grades Management System
//You are tasked with creating a program to manage student grades using a Vector in Java. Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.
//Input Example:
//Add grades: 78, 85, 92, 67, 88.
//Remove grade at index 3.
//Output Example:
//Grades: [78, 85, 92, 88]
//Highest Grade: 92
//Lowest Grade: 78
//Average Grade: 85.75
package Day9;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> val = new Vector<>();
        val.add(78);
        val.add(85);
        val.add(92);
        val.add(67);
        val.add(88);

        val.remove(3);
        System.out.println(val.toString());
        Collections.sort(val);
        System.out.println("HighestGrade:" + val.get(val.size() - 1));
        System.out.println("LowestGrade:" + val.get(0));
        int sum = 0;
        for (int i : val) {
            sum += i;
        }
        double ans=sum/val.size();
        System.out.println("AverageGrade:"+ans);

    }
}
