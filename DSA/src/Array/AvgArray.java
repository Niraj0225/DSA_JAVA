package Array;

import java.util.Arrays;

public class AvgArray {

    static double getAverage(int[] arr){
        double sum=0;
        double total=0;
        int len=arr.length;
        for (int i : arr){
            sum+=i;
        }
         total=sum/len;

        return total;

    }

    static int[] multiBy10(int[] arr){
        int size=arr.length;
        int[] newArr=new int[size];
        int x=0;
        for (int i:arr){
           newArr[x]= i*10;
           x++;
        }
        return newArr;
    }

    static boolean elementFound(int[] arr, int target){
        int size=arr.length;
        boolean found=false;
        for (int i = 0; i <size ; i++) {
            if(arr[i]==target){
                found=true;
            }
        }
        return found;
    }

    static int findMax(int[] arr){
        int max=arr[0];
//        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {

//            if (max<arr[i]){
//                max=arr[i];
//            }

            //using inbuilt math function
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    static int[] getPositiveOrNegative(int[] arr){
        int positiveSum=0;
        int negativeSum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                positiveSum+=arr[i];
            }else {
                negativeSum+=arr[i];
            }
        }
        int[] ans={positiveSum, negativeSum};
        return ans;
    }
    static int[] countZeroOrOne(int[] arr){
        int countZero=0;
        int countOne=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                countZero++;
            }else {
                countOne++;
            }
        }
        int[] ans={countZero, countOne};
        return ans;
    }

    static int findUnsortedNumber(int[] arr){
        int size=arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i+1] >arr[i]){
                continue;
            }
            return arr[i+1];
        }
        return 0;
    }
    static int[] swapAlternate(int[] arr){
        int size=arr.length;
        for (int i = 0; i < size-1; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    static int[] intersectionEle(int[] a, int[] b){
        int i=0, j=0, x=0;
        int[] newArr=new int[a.length];
        while (i<a.length && j<b.length){
            if (a[i]==b[j]){
                newArr[x++]=a[i];
                i++;
                j++;

            } else {
                i++;
                j++;
            }
        }
        return newArr;
    }

    static int[] extremeEle(int[] arr){
        int i=0, x=0;
        int j=arr.length-1;
        int[] newA=new int[arr.length];
        while (i<j){
            newA[x++]=arr[i];
            newA[x++]=arr[j];
            i++;
            j--;
        }
        return newA;
    }

    static void main() {
        int[] arr={2,30,56,78,8,68,24};
//        int[] nums={12,30,6,78,88,8,4};

        System.out.println(Arrays.toString(extremeEle(arr)));
    }
}
