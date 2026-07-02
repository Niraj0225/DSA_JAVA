package Array;

import java.util.Arrays;

public class SortZerosAndOnce {
    static int[] sort0sAnd1(int[] arr) {
        //brute force approach
        // Arrays.sort(arr); //TC=O(nlogn)
        int n = arr.length;
        int zeroCount = 0, oneCount = 0;
        //TC=O(n) SC=O(1)
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
//        System.out.println("Zero Count = "+zeroCount + " One Count = " + oneCount);
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }
        for (int i = zeroCount; i < n; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    //TC=O(n) SC=O(1)
    static int[] sortZeroAndOnce(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j] == 1) {
                j--;
            } else {
                i++;
            }
        }
        return arr;
    }

    static void main() {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        System.out.println("Brute force approach " + Arrays.toString(sort0sAnd1(arr)));
        System.out.println("optimize approach " + Arrays.toString(sortZeroAndOnce(arr)));
    }
}
