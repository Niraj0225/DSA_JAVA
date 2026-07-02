package Binary_Search;

public class SqrtX {

    static int findSquareRoot(int a){
        int s=1;
        int e=a;
        int ans=-1;
        if (a==0){
            return 0;
        }
        while (s<=e){
            int mid=s +(e-s)/2;

            if (mid == a/mid){
                return mid;
            } else if (mid > a/mid) {
                e=mid-1;
            }else {
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    static void main() {
        System.out.println(findSquareRoot(56));
    }
}
