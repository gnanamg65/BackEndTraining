//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.
//
//Example 1:
//Input: sequence = "ababc", word = "ab"
//Output: 2
//Explanation: "abab" is a substring in "ababc".
//
//Example 2:
//Input: sequence = "ababc", word = "ba"
//Output: 1
//Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
package Day7.AdditionalProgram;
import java.util.*;
public class RepeatingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        int count=0;
        for(int i=0;i<=str.length()-str1.length();i++){
            String temp=str.substring(i,i+str1.length());
            if(str1.equals(temp)){
                count++;
            }
        }
        System.out.println(count);
    }
}
