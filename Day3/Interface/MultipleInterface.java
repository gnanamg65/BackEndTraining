//Multiple Interfaces:
//Create two interfaces Printer with a method print() and Scanner with a method scan(). Create a class AllInOne that implements both interfaces.
package Day3.Interface;
interface printer{
    void print();
}
interface scanner{
    void scan();
}
class AllInOne implements printer,scanner{
    public void print(){
        System.out.println("Printing");
    }
    public void scan(){
        System.out.println("Scanning");
    }

}
public class MultipleInterface {
    public static void main(String[] args) {
        AllInOne aio=new AllInOne();
        aio.print();
        aio.scan();
    }
}
