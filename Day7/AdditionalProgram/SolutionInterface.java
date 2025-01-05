package Day7.AdditionalProgram;

import java.util.Scanner;

interface AdvancedArithmetic{
    int add(int n);
}
class Calculate implements AdvancedArithmetic{
    @Override
    public int add(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
public class SolutionInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculate calculate = new Calculate();
        int n=sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calculate.add(n));

    }
}
