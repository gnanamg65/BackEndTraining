package Day3;
import java.util.*;
public class Counter {
    static int val1=0;

  public   Counter(){
        val1++;
        System.out.println("Constructor 1:"+val1);
    }


    public static void main(String[] args) {
        Counter counter=new Counter();
        Counter counter1=new Counter();
        Counter counter2=new Counter();


    }
}
