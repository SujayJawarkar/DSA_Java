package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumProblem {
    public static void main(String[] args) {
        int sum = 14;
        int a[] = {3,9,8,7,5};
        ArrayList<ArrayList<Integer>> ans = combinationSum(a,sum);
        for (ArrayList<Integer> e: ans){
            System.out.println(e);
        }



    }
    static ArrayList<ArrayList<Integer>> combinationSum(int a[], int sum){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Arrays.sort(a);
        combinationSumHelper(a, sum, ans, cur, 0);
        return ans;
    }

    static void combinationSumHelper(int[] a, int sum, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> cur, int index) {
        if (sum<0) return;
        if (sum == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < a.length; i++) {
            if (i > index && a[i] == a[i-1]) continue; // This line is for duplicacy
            cur.add(a[i]);
            combinationSumHelper(a,sum-a[i],ans,cur,i+1);
            cur.remove(cur.size()-1);
        }
    }
}
