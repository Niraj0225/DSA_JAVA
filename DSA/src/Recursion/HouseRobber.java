package Recursion;

public class HouseRobber {

    // Recursive function
    // nums  -> array of money in each house
    // index -> current house we are considering
    public static int solve(int[] nums, int index) {

        // Base case:
        // If index goes outside the array,
        // there are no more houses to rob.
        if (index >= nums.length) {
            return 0;
        }

        // OPTION 1: Include / Rob current house
        //
        // If we rob nums[index],
        // we cannot rob the next house.
        // So we move to index + 2.
        int include = nums[index] + solve(nums, index + 2);

        // OPTION 2: Exclude / Skip current house
        //
        // We don't rob the current house,
        // so we can consider the next house.
        int exclude = 0 + solve(nums, index + 1);

        // Take whichever option gives more money.
        int ansFinal = Math.max(include, exclude);

        // Return the maximum money possible
        // from the current index.
        return ansFinal;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        // Start from the first house
        int index = 0;

        // Find maximum money
        int ans = solve(nums, index);

        System.out.println(ans);
    }
}