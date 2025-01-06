package Day8;
import java.util.ArrayList;
import java.util.List;
public class GreatestElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10};
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean find = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    find = true;
                    ll.add(arr[j]);
                    break;
                }
            }
            if (!find) {
                ll.add(-1);
            }
        }
            for (int a : ll) {
                System.out.println(a);
            }

    }
}
