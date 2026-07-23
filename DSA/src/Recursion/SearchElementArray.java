package Recursion;

public class SearchElementArray {
    static int searchInArray(int[] arr,int target,int i){
        int n=arr.length;

        if (i>=n){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }
        int ans=searchInArray(arr,target,i+1);
        return ans;
    }
    static void main() {
        int[] arr={10, 20, 30, 40, 50};
        int i=0;
        int target=50;
        System.out.println(searchInArray(arr, target, i));
    }
}
