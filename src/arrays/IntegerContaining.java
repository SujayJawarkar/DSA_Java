package arrays;
import java.util.*;



public class IntegerContaining {
    public static void main(String[] args) {
        int[] arr = {123, 83, 55, 12, 213313, 54, 13};
        int n = arr.length;
        System.out.println(find123Digits(arr, n));

    }
    static List<Integer> find123Digits(int[] arr, int n)
    {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            String str = String.valueOf(arr[i]);
            if (str.contains("1") || str.contains("2") || str.contains("3")){
                ans.add(arr[i]);
            }
        }

    return ans;
    }

}
