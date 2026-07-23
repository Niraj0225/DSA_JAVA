package Recursion;

public class PrintName {
    static void printMyName(int n){
        if (n==0){
            return;
        }
        System.out.println(n + " = Niraj");
        printMyName(n-1);
    }

    static void main() {
        printMyName(10);
    }
}
