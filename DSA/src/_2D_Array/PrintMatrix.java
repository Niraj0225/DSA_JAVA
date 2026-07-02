package _2D_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintMatrix {

     static int[] rowSum(int arr[][]) {

         List<Integer> ans=new ArrayList<>();
         int m=arr.length;
         int n=arr[0].length;
         for (int i = 0; i < m; i++) {
             int sum=0;
             for (int j = 0; j < n; j++) {
                 int value=arr[i][j];
                 sum =sum+value;
             }
             ans.add(sum);
         }

         int[] result = new int[ans.size()];

         for (int i = 0; i < ans.size(); i++) {
             result[i] = ans.get(i);
         }

         return result;
    }
    static int[] colSum(int arr[][]) {

        List<Integer> ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                int value=arr[j][i];
                sum =sum+value;
            }
            ans.add(sum);
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    static List<Integer> wavePrintMatrix(int[][] arr){
         List<Integer> ans=new ArrayList<>();
        int m=arr.length;
        for (int col = 0; col< m; col++) {
           if ((col & 1)==1){
              for(int row=m-1; row>=0; row--){
                  ans.add(arr[row][col]);
              }
           }else {
               for (int row=0; row<m; row++){
                   ans.add(arr[row][col]);
               }
           }
        }
        return ans;
    }

    static int[][] transposeMatrix(int[][] arr){
         if (arr==null || arr.length==0){
             return new int[0][0];
         }

         int totalRow=arr.length;
         int totalCol=arr[0].length;

         int newTotalRow=totalCol;
         int newTotalCol=totalRow;

         int[][] ans=new int[newTotalRow][newTotalCol];

        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalCol; j++) {
                ans[j][i]=arr[i][j];
            }
        }
        return ans;
    }

    //rotate image means rotate 2d array in 90 degree
    static void rotateArray(int[][] arr){
         int n=arr.length;
         for(int row=0;row<n;row++){
             for(int i=row+1;i<n;i++){
                 int temp=arr[row][i];
                 arr[row][i]=arr[i][row];
                 arr[i][row]=temp;
             }
         }
        for (int i = 0; i < n; i++) {
            int startCol=0;
            int endCol=n-1;
            while (startCol<=endCol){
                int temp=arr[i][startCol];
                arr[i][startCol]=arr[i][endCol];
                arr[i][endCol]=temp;

                startCol++;
                endCol--;
            }
        }
         //printing array
         int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //print spiral matrix
    static List<Integer> spiralMatrix(int[][] arr){
         int m=arr.length;
         int n=arr[0].length;

         int startingRow=0;
         int endingRow=m-1;
         int startingCol=0;
         int endingCol=n-1;
         List<Integer> res=new ArrayList<>();
         while (startingRow<=endingRow && startingCol<=endingCol){
             //row wise left to right=>startingRow print karni he, from startingCol to endingCol
             for(int col=startingCol; col<=endingCol;col++){
                 res.add(arr[startingRow][col]);
             }
            startingRow++;

             //col wise top to bottom=>endingCol print karni he, from startingRow to endingRow
                for (int row=startingRow;row<=endingRow; row++){
                    res.add(arr[row][endingCol]);
                }
                endingCol--;

             //row wise right to left=>endingRow print karni he, from endingCol to startingCol
             if (startingRow<=endingRow){
                 for(int col=endingCol; col>=startingCol;col--){
                     res.add(arr[endingRow][col]);
                 }
                 endingRow--;
             }
             //col wise bottom to top=>startingCol print karni he, from endingRow to startingRow
            if (startingCol<=endingCol){
                for (int row=endingRow; row>=startingRow; row--){
                    res.add(arr[row][startingCol]);
                }
                startingCol++;
            }

         }
         return res;
    }

    static void main(String[] args) {
         int[][] nums={{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
//         rotateArray(nums);
        System.out.println(spiralMatrix(nums));
    }
}
