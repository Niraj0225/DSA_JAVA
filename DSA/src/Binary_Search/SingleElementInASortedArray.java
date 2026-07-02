package Binary_Search;

public class SingleElementInASortedArray {
    //brute force approach
    static int singleNonDuplicate(int[] arr) {
        //TC O(n) SC=O(1)
        int n=arr.length;
        for (int i = 0; i < n-1; i=i+2) {
            if (arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    static int singleNonDuplicateOtp(int[] arr){
        int n=arr.length;
        int s=0;
        int e=n-1;
        while (s <= e) {
            int mid=s+(e-s)/2;
            
            //if single element exist in array            
            if (s==e){
                return arr[mid];
            }
            
            int currentValue=arr[mid];
            int prevValue=-1;
            if(mid-1>=0){
                prevValue=arr[mid-1];
            }
            int nextValue=-1;
            if (mid+1<n){
                nextValue=arr[mid+1];
            }
            if (currentValue != prevValue && currentValue !=nextValue){
                return currentValue;
            }
            
            //current element is not equal to previous value or current is equal to next value
            if (currentValue != prevValue && currentValue == nextValue){
               int currentStandingIndex=mid;
               //if current standing index is odd index value
               if ((currentStandingIndex & 1)==1){
                   //odd value answer exist in left side
                   e=mid-1;
               }else {
                   //even value answer exist in right side
                   s=mid +1;
               }
            } else if (currentValue == prevValue && currentValue != nextValue) {
                int currentStandingIndex=mid;
                if ((currentStandingIndex & 1)==1){
                    s=mid+1;
                }else {
                    e=mid-1;
                }
            }
        }
        return -1;
    }
    static void main() {
        int[]  nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicateOtp(nums));

    }
}
