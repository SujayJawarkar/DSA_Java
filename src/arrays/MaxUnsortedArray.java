package arrays;
import java.util.*;
/*Given an array A of non-negative integers of size N.
 Find the minimum subarray Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array,
 then the whole array should get sorted.
 If A is already sorted, output -1.*/
public class MaxUnsortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(subUnsort(a));
    }
    static ArrayList<Integer> subUnsort(ArrayList<Integer> A){
                int n = A.size();

                int left = -1;
                for (int i = 0; i < n - 1; i++) {
                    if (A.get(i) > A.get(i + 1)) {
                        left = i;
                        break;
                    }
                }

                int right = -1;
                for (int i = n - 1; i > 0; i--) {
                    if (A.get(i) < A.get(i - 1)) {
                        right = i;
                        break;
                    }
                }

                if (left == -1 && right == -1) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(-1);
                    return result; // Array is already sorted
                }

                int minVal = Integer.MAX_VALUE;
                int maxVal = Integer.MIN_VALUE;

                for (int i = left; i <= right; i++) {
                    minVal = Math.min(minVal, A.get(i));
                    maxVal = Math.max(maxVal, A.get(i));
                }


                while (left > 0 && A.get(left - 1) > minVal) {
                    left--;
                }


                while (right < n - 1 && A.get(right + 1) < maxVal) {
                    right++;
                }

                ArrayList<Integer> result = new ArrayList<>();
                result.add(left);
                result.add(right);
                return result;

            }

        /*public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
            int n = A.size();
            int[] mins = new int[n];
            int[] maxs = new int[n];
            maxs[0] = A.get(0);
            for(int i = 1; i < n; i++) {
                maxs[i] = Math.max(A.get(i), maxs[i-1]);
            }
            mins[n-1] = A.get(n-1);
            for(int i = n - 2; i >= 0; i--) {
                mins[i] = Math.min(A.get(i), mins[i+1]);
            }
            ArrayList<Integer> result = new ArrayList<Integer>();
            int start = 0;
            while (start < n && mins[start] == A.get(start)) start++;
            int end = n - 1;
            while (end >= 0 && maxs[end] == A.get(end)) end--;
            if(start == n) result.add(new Integer(-1));
            else {
                result.add(new Integer(start));
                result.add(new Integer(end));
            }
            return result;
        }*/
    }


