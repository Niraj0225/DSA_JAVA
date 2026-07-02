package _2D_Array;

public class Array2DQuestion {

     static int sumAndMulti(int[][] arr){
         int sum=0;
         int ans=1; //multiply 2d array value
         //sum of all value in 2d array
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int value=arr[i][j];
                 sum=sum+value;
                 ans=ans*value;
             }
         }
             return ans;

     }

     static int maxElement(int[][] arr){
         int max=Integer.MIN_VALUE;

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int value=arr[i][j];
//                 max=Math.max(max,value);
                 if (value>max){
                     max=value;
                 }

             }
         }
             return max;
     }

     static int minElement(int[][] arr){
         int min=Integer.MAX_VALUE;

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int value=arr[i][j];
                 min=Math.min(min,value);

             }
         }
         return min;
     }

    static void main() {
        int[][] arr ={{1,23,33}, {10,21,73}};

        System.out.println(minElement(arr));

    }
}
