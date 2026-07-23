package Recursion;

public class Fibonacci {

    static int fibonacciSeries(int n){
        if (n<=1){
            return 1;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
    static void main() {
        int n=19;
        for (int i = 0; i < n; i++) {
            System.out.print(" "+fibonacciSeries(i));
        }
    }
}
