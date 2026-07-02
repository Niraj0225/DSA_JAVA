package Binary_Search;

import java.util.Arrays;

public class Aggressive_Cows {
    //TC = O(n log d)
    public static int aggressiveCows(int[] arr, int k){
        Arrays.sort(arr);
        int n=arr.length;

        int start=0;
        int end=arr[n-1]-arr[0];
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (isValidAnswer(arr, mid, k)){
                //hume ke possible solution milgya
                //ans store karenge possible solution
                //move to right extact answer
                ans=mid;
                start=mid+1;
            }else {
                //mid k sath there is no possible arrangement to place
                //cows
                //move to left
                end=mid-1;
            }
        }
        return ans;
    }

    private static boolean isValidAnswer(int[] arr, int mid, int k) {
        int cowCount=1;
        //first cow is placed at 0 index
        int lastPosition=0;
        for (int i = 0; i < arr.length; i++) {
            //current cow to current position pr tabhi place karpaunga
            //jab current and prev cow k beech ka distance >= mid ho
            if (arr[i]-arr[lastPosition]>=mid){
                //can place safely
                cowCount++;

                //kyoki new cow place ho chuki h
                //iske matlb lastPosition ko update krna padega
                lastPosition=i;

                if (cowCount==k){
                    //iska matlb app saari cow place kr chuke he
                    return true;
                }
            }
        }
        return false;
    }

    static void main(String[] args) {
       int[] arr={1, 2, 8, 4, 9};
       int k=3;
        System.out.println(aggressiveCows(arr, k));
    }
}
