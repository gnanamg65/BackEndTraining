package Day8;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        Arrays.sort(arr);
        int val=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                System.out.println(val);
            }
            val++;
        }
        long end=System.currentTimeMillis();

    }
}
