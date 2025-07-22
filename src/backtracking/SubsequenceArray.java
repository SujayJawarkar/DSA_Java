package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceArray {
    public static void main(String[] args) {
        int a[] =  {4,5,5};
        ArrayList<ArrayList<Integer>> ans = subsequenceOfArray(a);
        for (ArrayList<Integer> e: ans){
            System.out.println(e);
        }

    }
    static ArrayList<ArrayList<Integer>> subsequenceOfArray(int a[]){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Arrays.sort(a);
        subsequenceArrayHelper(a,ans, cur, 0);
        return ans;
    }

    static void subsequenceArrayHelper(int[] a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> cur, int index) {
        ans.add(new ArrayList<>(cur));

        for (int i = index; i < a.length; i++) {
            if (i > index && a[i] == a[i-1]) continue; // This line is for duplicacy
            cur.add(a[i]);
            subsequenceArrayHelper(a,ans,cur,i+1);
            cur.remove(cur.size()-1);
        }
    }
}
