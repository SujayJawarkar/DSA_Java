package recursion;

public class recursionProblems {
    public static void main(String[] args) {
//        int i = nCr(5, 3);
        int i = josephus(5, 3);
        System.out.println(i);
    }

    static int josephus(int n, int k){
        if (n == 1) return 0;
        return (josephus(n-1, k) + k) % n;
    }

    static int nCr(int n, int r){
        if (n == r || r == 0) return 1;
        return nCr(n-1, r-1) + nCr(n-1, r);
    }
}
