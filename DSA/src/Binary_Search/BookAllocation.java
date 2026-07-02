package Binary_Search;
/*
Input: arr[] = [12, 34, 67, 90], k = 2
Output: 113
Explanation: Allocation can be done in following ways:
=> [12] and [34, 67, 90] Maximum Pages = 191
=> [12, 34] and [67, 90] Maximum Pages = 157
=> [12, 34, 67] and [90] Maximum Pages = 113.
The third combination has the minimum pages assigned to a student which is 113.
 */
public class BookAllocation {
    static int findPages(int[] arr, int k){
        int n=arr.length;
        int s=1;

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int e=sum;
        int ans=-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (isValidAnswer(arr, k, mid)){
                ans=mid;
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return ans;
    }

    private static boolean isValidAnswer(int[] arr, int k, int mid) {
        int studentCount=1;
        int pages=0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid){
                pages=pages+arr[i];
            }else {
                studentCount++;
                if (studentCount> k || arr[i]>mid){
                    return false;
                }else{
                    pages=0;
                    pages=pages+arr[i];
                }
            }
        }
        return true;
    }

    static void main() {
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPages(arr,k));
    }
}
