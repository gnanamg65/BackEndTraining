//1) Write a program that takes a sentence as input from the user and performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.
package Day6.String;
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] str2 = str1.split("");
        int count = 0;
        for (String i : str2) {
            count++;
        }
        System.out.println("Count the number of words in the sentence."+count);
        StringBuilder sb = new StringBuilder(str1);
        System.out.println("Reverse the entire sentence."+sb.reverse());
        System.out.println("Replace all vowels in the sentence with the character:"+str1.replaceAll("[AEIOUaeiou]","*"));
    }

}
