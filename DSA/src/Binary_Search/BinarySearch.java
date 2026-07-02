package Binary_Search;

public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=start + (end-start)/2;
        while (start<=end){
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                    start=mid+1;
            }else {
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60,70};
        int target=50;
        System.out.println(binarySearch(arr,target));
    }
}