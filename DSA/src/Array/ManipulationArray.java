package Array;

import java.util.*;

public class ManipulationArray {

    static int[] reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[] shiftBy1Position(int[] arr){
        int n= arr.length;
        int temp=arr[n-1];
        for (int i = n-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }

    static int findMode(int[] arr){
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        int currentFre=0;
        int maxFre=0;
        for (int key:map.keySet()){
            int currentKey=key; //getting each key
            int currentKeyKiFre=map.get(key); //getting value of each key
            System.out.println(map.get(key));
            if (currentKeyKiFre>currentFre){
                currentFre=currentKeyKiFre;
                maxFre= currentKey;
            }
        }
        return maxFre;
    }

    //homework problem
    static void shiftEleByKPos(int[] arr,int k){
        //TC=O(n) SC=O(n)
        int x=0;
        int n=arr.length;
        int m=arr.length-1;
//        int[] shiftArr=new int[k+1];
        //use to arraylist to store element
        ArrayList<Integer> shiftArr=new ArrayList<>();
        //store right side element from arr in arraylist to k position
        for (int i=n-1;i>k; i--){
            shiftArr.add(arr[i]);
        }
//        System.out.println(Arrays.toString(shiftArr));
        //shifting left side element in right side from last
        for (int i=k;i>=0;i--){
            arr[m--]=arr[i];
        }
        //reverse array list for shift element in array
        Collections.reverse(shiftArr);

        //add element from arraylist in arr from left side
        for (int i = 0; i <= k; i++) {
            arr[i]= shiftArr.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void findUnionArray(int[] n, int[] m){
        //TC=O(n+m)^2 SC=O(n+m)
        int x=0;
        ArrayList<Integer> newArr=new ArrayList<>();
        for (int num:n){
            if (!newArr.contains(num)){
                newArr.add(num);
            }
        }

        for(int num:m){
            if (!newArr.contains(num)){
                newArr.add(num);
            }
        }
        System.out.println(newArr);

    }

    static void main() {
        int[] n={ 1, 2, 3, 2, 1 };
        int[] m={3, 2, 2, 3, 3, 2};
        findUnionArray(n,m);
//        System.out.println("final ans= "+findMode(nums));
    }
}
