package Day3;
import java.util.*;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j <=arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
        System.out.println("Smallest number:"+arr[0]);
        System.out.println("Largest number:"+arr[arr.length-1]);

        }

    }

