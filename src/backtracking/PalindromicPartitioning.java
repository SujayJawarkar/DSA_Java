package backtracking;

import java.util.ArrayList;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        String s = "abbacca";
        ArrayList<ArrayList<String>> ans = palindromicPartion(s);
        for (ArrayList<String> e: ans){
            System.out.println(e);
        }
    }

    static ArrayList<ArrayList<String>> palindromicPartion(String s){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> cur = new ArrayList<>();

        palindromicPartitioningHelper(s, ans, cur, 0);
        return ans;

    }

    static void palindromicPartitioningHelper(String s, ArrayList<ArrayList<String>> ans, ArrayList<String> cur, int index){
        if (index == s.length()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindromic(s, index, i)){
                cur.add(s.substring(index, i+1));
                palindromicPartitioningHelper(s, ans, cur, i+1);
                cur.remove(cur.size()-1); // Remove Last Element Backtracking
            }

        }
    }


    static boolean isPalindromic(String s, int i, int j){
        while (i<=j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

