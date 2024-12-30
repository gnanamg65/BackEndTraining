package Day3;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        int [][]arr2=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr2[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
