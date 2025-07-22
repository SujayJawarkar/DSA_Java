package recursion;

public class BasicsOfRecursion {
    public static void main(String[] args) {
//        fun(6);
//        foo(6);
//        bar(4);
//        System.out.println(sumOfN(5));
//        System.out.println(fibonacciNum(4));
    }

    static int fibonacciNum(int n){
        if(n <= 1) return n;
        else {
            return fibonacciNum(n-1) + fibonacciNum(n-2);
        }
    }
    static int sumOfN(int n){
        if (n == 1) return 1;
        else {
            return sumOfN(n-1)+n;
        }

    }
    static void fun(int n){
        if (n > 0){
            System.out.println(n);
            fun(n-1);
        }
    }

    static void foo(int n){
        if (n > 0){
            foo(n-1);
            System.out.println(n);
        }
    }
    static void bar(int n){
        if (n > 0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }
}
