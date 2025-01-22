//Using Optional with Default Values Write a program that uses Optional
// to provide a default value of "Guest" when no name is provided.
package Day17;
import java.util.Optional;
public class OptionalWithDefaultValue {
    public OptionalWithDefaultValue(){
        String str="sanj";
        Optional<String>optionalS=Optional.ofNullable(str);
        String str1=optionalS.orElse("Guest");
        if(optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }
        else{
            System.out.println(str1);
        }
    }

    public static void main(String[] args) {
        OptionalWithDefaultValue optionalWithDefaultValue=new OptionalWithDefaultValue();
    }
}
