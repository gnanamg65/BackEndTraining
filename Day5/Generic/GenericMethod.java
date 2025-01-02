package Day5.Generic;
import java.util.*;
public class GenericMethod {
    public <T> void printArray(T[]arr){
        for(T i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenericMethod gm=new GenericMethod();
        int n=sc.nextInt();
        Integer[] intArray=new Integer[n];
        for(int i=0;i<n;i++){
            intArray[i]= sc.nextInt();
        }
        String[] stringArray=new String[n];
        for(int i=0;i<n;i++){
            stringArray[i]= sc.nextLine();
        }
        Double[]doubles=new Double[n];
        for(int i=0;i<n;i++){
            doubles[i]= sc.nextDouble();
        }
        gm.printArray(intArray);
        gm.printArray(stringArray);
        gm.printArray(doubles);
    }
}
