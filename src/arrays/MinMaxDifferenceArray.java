package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxDifferenceArray {
    public static void main(String[] args) {
        int[] a = {12,8,9,2,11};
        List<List<Integer>> ans = minimumDiff(a);
        System.out.println(ans);

    }
    static List<List<Integer>> minimumDiff(int[] a){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, a[i]-a[i-1]);
        }

        for (int i = 1; i < n; i++) {
            if (a[i]-a[i-1] == minDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
