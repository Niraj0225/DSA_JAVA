package Array;

import java.util.Arrays;

public class sort0s1sAnd2s {
    //TC=O(n)  SC=O(1) //but use multi loop for counting and inserting
    static void sortArrayBy(int[] arr){
        int zeroCount=0, oneCount=0, twoCount=0;
        for (int n:arr){
            if (n==0){
                zeroCount++;
            } else if (n==1) {
                oneCount++;
            }
            else {
                twoCount++;
            }
        }
//        System.out.println(twoCount);
        int index=0;
        for (int i = 0; i < zeroCount; i++) {
            arr[index++]=0;
        }
        for (int i = 0; i < oneCount; i++) {
            arr[index++]=1;
        }
        for (int i = 0; i < twoCount; i++) {
            arr[index++]=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int[] sortArrayOpt(int[] arr){
        int i=arr[0], mid=arr[0];
        int n=arr.length;
        int j=n-1;
        while (mid<=j){
            if (arr[mid]==0){
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                i++;
                mid++;
            }
            else if (arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[j];
                arr[j]=temp;
                j--;
//                mid++;
            }
            else {
                mid++;
            }
        }
        return arr;
    }


    static void main() {
        int[] arr={0,1,1,0,1,2,1,2,0,0,2,1};
//        sortArrayBy(arr);

        System.out.println(Arrays.toString(sortArrayOpt(arr)));
    }
}
