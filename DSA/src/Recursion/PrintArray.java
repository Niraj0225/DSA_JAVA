package Recursion;

public class PrintArray {
    static void printArray(int[] arr, int i){
        int n=arr.length;
        if (i>=n){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr,i+1);
    }
    static void main() {
        int[] arr={10, 20, 30, 40, 50};
        int i=0;
        printArray(arr, i);
    }
}
