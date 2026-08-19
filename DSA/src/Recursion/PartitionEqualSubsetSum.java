package Recursion;

public class PartitionEqualSubsetSum {
    public static boolean solve(int target, int[] nums, int index){
        //base case
        if(target==0){
            return true;
        }
        if(target<0){
            return false;
        }
        if(index>=nums.length){
            return false;
        }

        boolean includeAns=solve(target-nums[index], nums, index+1);
        boolean excludeAns=solve(target, nums, index+1);

        return includeAns || excludeAns;
    }
    static void main() {
        /*
         Input: nums = [1,5,11,5]
         Output: true
         Explanation: The array can be partitioned as [1, 5, 5] and [11].
         */
        int[] nums={1,5, 11, 5};
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        if((sum & 1)==1){
            System.out.println(false);
        }
        int index=0;
        int target=sum/2;
        boolean ans=solve(target,nums,index);
        System.out.println(ans);

    }
}
