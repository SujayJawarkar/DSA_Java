package backtracking;

public class KnightsTourProblem {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] ints = knightsTourProb(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] knightsTour(int n){
        int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = -1;
                }
        }
            a[0][0] = 0;
            int movesX[] = {2, 1, -1, -2, -2, -1, 1, 2};
            int movesY[] = {1, 2, 2, 1, -1, -2, -2, -1};

            knightsTourHelper(n, a, movesX, movesY, 0,0,1);
            return a;
    }
    static boolean knightsTourHelper(int n, int a[][], int movesX[], int movesY[], int curX, int curY, int step ){
        if (step == n*n) return true;

        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];
            if (isValid(n, a, nextX, nextY)){
                a[nextX][nextY] = step;
                boolean isTourCompleted = knightsTourHelper(n, a, movesX, movesY, nextX, nextY, step+1);
                if (isTourCompleted){
                    return true;
                }else {
                    a[nextX][nextY] = -1;
                }
            }
        }
                return false;
    }

    static boolean isValid(int n, int a[][], int x, int y){
        return ( x >= 0 && y >= 0 && x < n && y < n && a[x][y] == -1);
    }


    static int[][] knightsTourProb(int n, int m){
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = -1;
            }
        }
        a[0][0] = 0;
        int movesX[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int movesY[] = {1, 2, 2, 1, -1, -2, -2, -1};

        knightsTourProbHelper(n, m, a, movesX, movesY, 0,0,1);
        return a;

    }

    static boolean knightsTourProbHelper(int n, int m, int[][] a, int[] movesX, int[] movesY, int curX, int curY, int step){
        if (step == n*m) return true;

        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];
            if (isValidProb(n, m, a, nextX, nextY)){
                a[nextX][nextY] = step;
                boolean isTourCompleted = knightsTourProbHelper(n, m, a, movesX, movesY, nextX, nextY, step+1);
                if (isTourCompleted){
                    return true;
                }else {
                    a[nextX][nextY] = -1;
                }
            }

        }
        return false;

    }

    static boolean isValidProb(int n, int m, int a[][], int x, int y){
        return ( x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1);
    }



}
