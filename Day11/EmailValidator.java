package Day11;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="^[A-Za-z0-9]+([.-_][A-Za-z0-9]+)*@[A-Za-z0-9.-]+\\.(com|org|net)$";
        List<String>string=List.of(
                "user@example.com",
                "user.name@domain.org",
                "invalid-email@domain",
                "user@domain_net",
                "@missinguser.com"
        );
        Pattern pattern=Pattern.compile(str);
        for(String email:string){
            Matcher matcher= pattern.matcher(email);
            if(matcher.find()){
                System.out.println(email+" vaild");
            }
            else {
                System.out.println(email+" Invalid");
            }
        }


    }
}

