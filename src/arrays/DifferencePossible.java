package arrays;

import java.util.Arrays;

public class DifferencePossible {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 10, 14, 18};
        int k = 5;
        System.out.println(diffPossible(arr, k));

    }
    static boolean diffPossible(int[] a, int k) {
        int n = a.length;
//        int startFrom = 0;
        Arrays.sort(a);
        boolean ans = false;

//        while (n > startFrom) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] - a[i] == k) {
                        ans = true;
                        break;
                    }
                }
            }
//            startFrom++;
//        }
        return ans;
    }
}
