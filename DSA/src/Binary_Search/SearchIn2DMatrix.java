package Binary_Search;

public class SearchIn2DMatrix {
    //brute force approach
    static boolean searchMatrix(int[][] matrix, int target){
        //TC=0(n^2)
        int row=matrix.length;
        int col=matrix[0].length;
         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 if(matrix[i][j]==target){
                     return true;
                 }
             }
         }
          return false;
    }

    //optimize approach using binary search
    static boolean searchMatrix1(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int n=row*col;
        int s=0;
        int e=n-1;
//optimize approach using binary search TC=O(log(m * n))
        while(s<=e){
            int mid=s+(e-s)/2;
            int rowIndex=mid/col;
            int colIndex=mid%col;

            if(matrix[rowIndex][colIndex]==target){
                return true;
            }
            else if(matrix[rowIndex][colIndex]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }

        return false;
    }


    static void main() {
        /*
        You are given an m x n integer matrix matrix with the following two properties:
        Each row is sorted in non-decreasing order.
        The first integer of each row is greater than the last integer of the previous row.
        Given an integer target, return true if target is in matrix or false otherwise.
        You must write a solution in O(log(m * n)) time complexity.
        */
       int[][] matrix = {{1, 3, 5, 7},
                         {10, 11, 16, 20},
                         {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
