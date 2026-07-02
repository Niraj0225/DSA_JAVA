package Array;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromSortedArr {
    static void main() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Map<Integer,Integer> ans=new HashMap<>();
        for (int arr:nums){
            ans.put(arr, ans.getOrDefault(arr,0)+1);
        }
        System.out.println(ans.size());

    }
}
