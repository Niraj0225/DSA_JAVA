package Array;

public class FindMissingNumber {
    //brute force approach
    static int findMissingNumber(int[] arr){
        int sum=0;
        int totalSum=0;
        int n=arr.length;
        for (int num:arr){
            sum +=num;
        }
        System.out.println(sum);
        for (int i = 1; i <= n; i++) {
            totalSum +=i;
        }
        System.out.println(totalSum);
        int ans=totalSum-sum;
        return ans;
    }

    //better approach
    static int missingNumber(int[] arr){
        int n=arr.length;
        int ans=n*(n+1)/2;
        int sum=0;
        for (int num:arr){
            sum +=num;
        }
//        System.out.println(ans);
        return ans-sum;
    }

    static int missingNumXOR(int[] arr){
        int xorSum=0;
        for (int n: arr){
            xorSum=xorSum ^ n;
        }
        for (int i = 0; i <= arr.length; i++) {
            xorSum=xorSum ^ i;
        }
        return xorSum;
    }

    static void main() {
        int[] arr={1,2,4,0,5};
        System.out.println("final Ans "+ missingNumXOR(arr));

    }
}
