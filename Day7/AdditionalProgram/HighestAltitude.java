package Day7.AdditionalProgram;

public class HighestAltitude {
    public static void main(String[] args) {
        int []arr={-5,1,5,0,-7};
        int value1=0;
        int value2=0;
        for(int i=0;i<arr.length;i++){
            value1+=arr[i];
            value2=Math.max(value1,value2);
        }
        System.out.println(value2);
    }
}
