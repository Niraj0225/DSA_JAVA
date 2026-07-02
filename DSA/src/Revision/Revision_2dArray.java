package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revision_2dArray {

    static List<Integer> sumRow(int[][] arr){
        List<Integer> ans=new ArrayList<>();
        int m= arr.length;
        int n=arr[0].length;

        for (int i = 0; i < m; i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
                int value=arr[i][j];
                sum=sum+value;
            }
            ans.add(sum);
        }
        return ans;

    }
    static List<Integer> sumCol(int[][] arr){
        List<Integer> ans=new ArrayList<>();
        int m= arr.length;
        int n=arr[0].length;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                int value=arr[j][i];
                sum=sum+value;
            }
            ans.add(sum);
        }
        return ans;

    }

    static List<Integer> waveMatrixPrint(int[][] arr){
        List<Integer> ans=new ArrayList<>();
        int m=arr.length;

        for (int col=0; col<m; col++){
            if ((col & 1)==1){
                //run bottom to top for odd column
                for (int i =m-1; i >=0 ; i--) {
                    ans.add(arr[i][col]);
                }
            }else {
                //run top to bottom for even column
                for (int i = 0; i < m; i++) {
                    ans.add(arr[i][col]);
                }
            }
        }
        return ans;
    }

    static int[][] transposeMatrixPrint(int[][] arr){
        int allRow=arr.length;
        int allCol=arr[0].length;

        int newRow=allCol;
        int newCol=allRow;

        int[][] ans=new int[newRow][newCol];

        for (int i = 0; i < allRow; i++) {
            for (int j = 0; j < allCol; j++) {
                ans[j][i]=arr[i][j];
            }
        }
        return ans;
    }
    static void main() {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println(Arrays.deepToString(transposeMatrixPrint(arr)));

    }
}
