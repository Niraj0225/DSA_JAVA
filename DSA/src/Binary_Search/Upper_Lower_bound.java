package Binary_Search;

public class Upper_Lower_bound {
    static int lowerBound(int[] arr,int target){
        //for brute force use linear search
        //this tc=O(log n)
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>=target){
                //ans store
                ans= mid;
                //move to left
                e=mid-1;
            }else {
                //right move
                s=mid+1;
            }
        }
        return ans;
    }
    static int upperBound(int[] arr, int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]<=target){
                //move right
                s=mid+1;
            } else {
                //arr[mid]>target
                //ans store
                ans=mid;
                //move left
                e=mid-1;
            }
        }
        return ans;
    }
    static void main() {
        int[] arr = {10, 20, 30, 30, 30, 30, 40, 50, 60};
        int target=35;
        int res=upperBound(arr,target);
        System.out.println("ans = "+ res);
    }
}