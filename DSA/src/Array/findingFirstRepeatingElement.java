package Array;

import java.util.HashMap;
import java.util.Map;

public class findingFirstRepeatingElement {
    static int firstRepeat(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    return i+1;
                }
            }
        }
            return -1;
    }

//    static int repeatingNum(int[] arr){
//        Map<Integer, Integer> rep=new HashMap<>();
//        for (int num:arr){
//            rep.put(num,rep.getOrDefault(num,0)+1);
//        }
//
//        for (int i=0; i<arr.length;i++){
//            if (rep.get(arr[i]>1)){
//                return i+1;
//            }
//        }
//        return -1;
//    }
    static void main() {
       int[] arr= {1, 5, 3, 4, 3, 5, 6};

        System.out.println(firstRepeat(arr));
    }
}
