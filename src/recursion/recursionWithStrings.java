package recursion;

public class recursionWithStrings {
    public static void main(String[] args){
/*        String a = "abba";
        boolean palindrome = isPalindrome(a);
        System.out.println(palindrome);*/
/*        String a = "ababcabcabc";
        String t = "ab";
        System.out.println(countOccurances(a,t));*/
        String a = "abc";
        printAllSubsets(a);
    }
    static boolean isPalindrome(String s){
        return isPalindromeHelper(s, 0, s.length()-1);
    }
    static boolean isPalindromeHelper(String s, int l, int r){
        if (l >= r) return true;
        if (s.charAt(l) == s.charAt(r)){
            return isPalindromeHelper(s,l+1, r-1);
        }
        else {
            return false;
        }
    }

    static int countOccurances(String t, String s){
        return countOccurancesHelper(s,t,0);
    }

    static int countOccurancesHelper(String t, String s, int i){
        if (i > s.length() - t.length()) {
            return 0;
        }
        int subProblemAns = countOccurancesHelper(t,s,i+1);
        if(s.substring(i, i+t.length()).equals(t)){
            return subProblemAns +1;
        }
        else {
            return subProblemAns;
        }

    }
    static void printAllSubsets(String s){
        printAllSubsetsHelper(s,0,"");

    }
    static void printAllSubsetsHelper(String s, int i, String cur){
        if (i == s.length()){
            System.out.println(cur);
            return;
        }
        printAllSubsetsHelper(s,i+1,cur+s.charAt(i));
        printAllSubsetsHelper(s,i+1,cur);
    }

}
