//Static Variables and Methods:
//Write a program with a class Counter that has a static variable to count the number of objects created. Create three objects and print the count using a static method.
package Day3.Static;
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
