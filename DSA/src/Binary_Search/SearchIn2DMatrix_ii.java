package Binary_Search;

public class SearchIn2DMatrix_ii {
    static boolean searchInMatrix(int[][] matrix, int target){
        //TC=0(m*n)
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

    static boolean searchIn2DMatrix(int[][] matrix, int target){
        //TC=O(m+n)
        int totalRow=matrix.length;
        int totalCol=matrix[0].length;

        int row=0;
        int col=totalCol-1;

        while (row < totalRow && col >=0){
            if (matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    static void main() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target=5;
        System.out.println(searchIn2DMatrix(matrix,target));

    }
}
