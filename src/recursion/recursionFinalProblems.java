package recursion;

public class recursionFinalProblems {
    public static void main(String[] args){
//        System.out.println(powerFunc(2,10));
        int m = (int) (1e9+7);
        System.out.println(fastPower(2,10));
        System.out.println(fastPowerWithModulo(2,10, m));
    }


    static int powerFunc(int a, int b){
        if (b == 0) return 1;
        return powerFunc(a, b-1) * a;
    }

    static int fastPower(int a, int b){
        if (b == 0) return 1;
        if( b%2 == 0) return fastPower(a*a, b/2);
        return a * fastPower(a, b-1);
    }
    static int fastPowerWithModulo(int a, int b, int m){
        if (b == 0) return 1;
        if( b%2 == 0) return fastPowerWithModulo((a*a)%m, b/2, m);
        return (a * fastPower(a, b-1) % m ) % m;
    }

    static int matrixPaths(int m, int n){
        if (m == 1 || n == 1 )return 1;
        return matrixPaths(m, n-1) + matrixPaths(m-1, n);
    }
}
