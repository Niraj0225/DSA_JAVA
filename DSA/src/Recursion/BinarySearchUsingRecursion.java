package Recursion;

public class BinarySearchUsingRecursion {

    //TC = 0(log n) SC=O(log n)
    static int solve(int[] arr, int target, int s, int e){

        if (s>e){
            return -1;
        }
        int mid= s + (e-s)/2;
        if (arr[mid]==target){
            return arr[mid];
        } else if (arr[mid] >target) {
            e=mid-1;
        }else {
            s=mid+1;
        }
        return solve(arr,target, s, e);
    }

    static void main() {
        int[] arr={10, 20, 30, 40, 50, 60, 70};
        int target=70;
        int s=0;
        int e= arr.length-1;
        System.out.println(solve(arr, target,s ,e));
    }
}
