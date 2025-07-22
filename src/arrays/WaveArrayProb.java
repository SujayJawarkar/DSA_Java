package arrays;

import java.util.Arrays;

public class WaveArrayProb {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        waveArray(a);
//        waveArrayNonLexicographically(a);
        printArray(a);
    }

    static void waveArray(int[] a){
        Arrays.sort(a); // O(nlog n)
        int n = a.length;
        for (int i = 1; i < n; i+=2) {
            swap(a, i, i-1);
        }
    }

    static void waveArrayNonLexicographically(int[] a){
        //O(n)
        int n = a.length;
        for (int i = 1; i < n; i+=2) {
            if (a[i] > a[i-1]){
                swap(a,i,i-1);
            }
            if (i<n-1 && a[i] > a[i+1]){
                swap(a, i, i+1);
            }
        }

    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a){
        for (int e: a){
            System.out.print(e + " ");
        }
    }
}
