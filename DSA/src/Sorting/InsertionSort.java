package Sorting;

public class InsertionSort {
    static void insertionSort(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int prev=i-1;
            int currValue=arr[i];
            while (prev>=0 && currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currValue;
        }
    }
    static void main() {
        int[] arr = {12, 11, 13, 5, 6};

        insertionSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
