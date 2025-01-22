//Handling Null with Optional Write a program that accepts a String input,
// converts it to uppercase if it's not null, and prints "Empty input" if the string is null.
package Day17;
import java.util.Optional;
public class HandlingNullWithOptional {
   public  HandlingNullWithOptional(){
        String str="Gnana";
        Optional<String>optionalS=Optional.ofNullable(str);
        if(optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }
        else{
            System.out.println(optionalS.get());
        }
    }

    public static void main(String[] args) {
HandlingNullWithOptional hm=new HandlingNullWithOptional();
    }
}
