package Day7.AdditionalProgram;

public class Chip {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)count++;
        }
        int ans=Math.min(count,arr.length-count);
        System.out.println(ans);
    }
}
