package Day5.AutoboxAndVarargs;

public class varargs {
    public static void main(String[] args) {
    sum(1,2,3,4,5);
    }
    public static void sum(int... a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
}
