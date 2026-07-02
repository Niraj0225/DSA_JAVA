package Array;

public class PivotIndex {
    static int pivotIndex(int[] nums) {
        int n= nums.length;
        for (int i = 0; i <n ; i++) {
            int leftSum=0;
            for (int j = 0; j < i; j++) {
                leftSum+=nums[j];
            }
           int rightSum=0;
            for (int j = i+1; j <n ; j++) {
                rightSum+=nums[j];
            }
            if (leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

    static int pivotInx(int[] arr){
        int n=arr.length;
        int totalSum=0, leftSum=0, rightSum=0;
        for (int num:arr){
            totalSum+=num;
        }
        for (int i = 0; i < n; i++) {
            rightSum = totalSum - leftSum -arr[i];

            if (leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    static void main() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotInx(nums));
    }
}
