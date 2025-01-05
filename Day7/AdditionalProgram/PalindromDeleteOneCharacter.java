package Day7.AdditionalProgram;
import java.util.*;
public class PalindromDeleteOneCharacter {

    static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            String temp="";
            temp+=s.substring(0,i);
            temp+=s.substring(i+1,s.length());
            StringBuilder sb=new StringBuilder(temp);
            sb.reverse();
            if(sb.toString().equals(temp)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        System.out.println(isPalindrome(st));
    }
}
