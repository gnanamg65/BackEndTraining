package Day3;
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
