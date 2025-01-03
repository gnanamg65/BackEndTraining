//Java Lang Objects
//Create a program that demonstrates:
//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().
package Day6.JavaLangObjects;
import java.util.*;
public class Main {
   private String  a;
    private int b;
  public   Main(String a, int b){
        this.a=a;
        this.b=b;
    }
//    @Override
//    public String toString() {
//        return  a + " " + b;
//    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        Main main = new Main(sc.nextLine(), sc.nextInt());
        System.out.println(main.getClass());
        System.out.println(main.toString());

    }
}
