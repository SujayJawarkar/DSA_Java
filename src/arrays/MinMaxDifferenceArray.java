package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxDifferenceArray {
    public static void main(String[] args) {
        int[] a = {12,8,9,2,11};
//        List<List<Integer>> ans = minimumDiff(a);
        System.out.println(maxDiff(a));

    }

    static int maxDiff(int[] a){
        int n = a.length;
        int[] aipi =  new int[n];
        int[] aimi =  new int[n];

        for(int i = 0; i < n; i++){
            aipi[i] = a[i] + i;
            aimi[i] = a[i] - i;
        }

        int minaipi =  Integer.MAX_VALUE;
        int maxaipi =  Integer.MIN_VALUE;

        int minaimi =  Integer.MAX_VALUE;
        int maxaimi =  Integer.MIN_VALUE;

        for(int e: aipi){
            minaipi = Math.min(minaipi,e);
            maxaipi = Math.max(maxaipi,e);
        }
        for(int e: aimi){
            minaimi = Math.min(minaimi,e);
            maxaimi = Math.max(maxaimi,e);
        }

        int diffaipi = maxaipi - minaipi;
        int difaimi = maxaimi - minaimi;

        return Math.max(diffaipi, difaimi);

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
