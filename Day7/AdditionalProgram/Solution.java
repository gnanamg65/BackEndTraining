package Day7.AdditionalProgram;
class Arithmetic {
int add(int a, int b) {
    return a+b;
}
}
class Adder extends Arithmetic {
}
public class Solution {
public static void main(String[] args) {
    Adder adder = new Adder();
    System.out.println("My superclass is:"+adder.getClass().getGenericSuperclass().getTypeName());
    System.out.println(adder.add(30,12) + " " + adder.add(10,3) + " " + adder.add(15,5));
}
}

