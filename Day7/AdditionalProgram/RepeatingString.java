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
