package arrays;
import java.util.*;
public class FindSumPair {

    public static void main(String[] args) {
    int[] a = {2, 8, 7, 1, 5};
//        int[] a = {1, 9, 10, 8, 2, 2, 10, 7, 9, 1};
        System.out.println(findPair(a));
    }
    static List<List<Integer>> findPair(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        boolean found = false;

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (set.contains(arr[i] + arr[j])) {

                    List<Integer> pair = new ArrayList<>();

                    pair.add(arr[i]);

                    pair.add(arr[j]);

                    res.add(pair);

                    found = true;
                }
            }
        }

        if (found) {

            res.sort((a, b) -> {
                int cmp = Integer.compare(a.get(0), b.get(0));
                if (cmp == 0) {
                    return Integer.compare(a.get(1), b.get(1));
                }
                return cmp;
            });
        }

        return res;
    }
}









//    static List<List<Integer>> findPair(int[] arr)
//    {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                int sum = arr[i] + arr[j];
//                boolean res = checkSum(sum, arr);
//                if (res) {
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(arr[i]);
//                    temp.add(arr[j]);
//                    ans.add(temp);
//                }
//            }
//        }
//        return ans;
//    }
//
//    static boolean checkSum(int sum, int[] arr) {
//        for (int i : arr) {
//            if (i == sum){
//                return true;
//            }
//        }
//        return false;
//    }
//}


//while (startFrom < l){
//            for (int i = 0; i < l-1; i++) {
//                int sum = arr[i] + arr[l-i];
//                boolean res = checkSum(sum, arr);
//                if (res){
//                    temp.add(arr[i]);
//                    temp.add(arr[l-i]);
//                    ans.add(temp);
//                    l--;
//                    startFrom++;
//                }else {
//                    l--;
//                }
//            }
//            l--;
//            startFrom++;
//        }