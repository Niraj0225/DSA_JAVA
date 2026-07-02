package Binary_Search;

public class SearchInAlmostSortArr {
    static int findTarget(int arr[], int target) {
        // TC =O(n) SC=O(1)
        //using linear search algo
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int findTarget1(int arr[], int target) {
        // TC =O(log n) SC=O(1)
        //using binary search algo
        int n=arr.length;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(mid+1 < n && arr[mid+1]==target){
                return mid+1;
            }
            if( mid-1 >=0 && arr[mid-1]==target){
                return mid-1;
            }

            if(target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
       int[] arr ={10, 3, 40, 20, 50, 80, 70};
        int target = 50;
        System.out.println(findTarget1(arr,target));
    }
}
