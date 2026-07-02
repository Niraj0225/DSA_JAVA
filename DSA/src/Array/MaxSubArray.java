package Array;

public class MaxSubArray {

    //TC=O(n)^2  SC=O(1)
    static int maxSubArr(int[] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
        int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
            return maxSum;
    }

    //TC=O(n)  SC=O(1)
    static int optMaxSumArr(int[] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if (sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    static void main() {

   int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(optMaxSumArr(nums));
    }
}
