package Binary_Search;

public class PeakIndexInMountainArray {
    //brute force approach
    static int peakIndex(int[] arr){
        //this linear search algo use
        //TC=O(n) SC=O(1)
        int n=arr.length;
        int max=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    //optimize approach using binary search
    //TC=O(log n) SC=O(1)
    static int peakIndexGreater(int[] arr){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]<arr[mid+1]){
                //move right side part array
                s=mid+1;
            }else {
                //store ans if mid at point is final ans but not confirm
                ans=mid;
                //if mid-1 greater than mid move left side
                e=mid-1;
            }
        }
        return ans;
    }
    static void main() {
        int[] arr={1,3,5,2,1};
        System.out.println(peakIndexGreater(arr));

    }
}
