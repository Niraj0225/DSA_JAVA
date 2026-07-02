package Binary_Search;

public class EKO_SPOJ {

    //TC=O(n log n)
    static int maxSawHeight(int[] arr, int m){
        int n=arr.length;
        int sum=0;
        for (int num:arr){
            sum=sum+num;
        }
        int s=0;
        int e=sum;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (isValidAns(arr, m, mid)){
                ans=mid;
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return ans;
    }

    private static boolean isValidAns(int[] arr, int m, int mid) {
        int totalTreeCollect=0;
        for (int i = 0; i < arr.length; i++) {

            //check current tree height greater than mid/blade position at tree
            if (arr[i]>mid){
                int currentTreeCollect=arr[i]-mid;
                totalTreeCollect+=currentTreeCollect;
            }
        }
        if (totalTreeCollect>=m){
            return true;
        }
        else {
            return false;
        }
    }

    static void main(String[] args) {
        int[] arr={20, 15 ,10, 17};
        int m=7;

        System.out.println(maxSawHeight(arr, m));
    }
}
