package Recursion.BackTracking;

import java.util.Arrays;
import java.util.List;

public class TriangleProblem {
    public static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex)
    {
        if(rowIndex==triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }

        int downAns=solve(triangle, rowIndex+1, colIndex);
        int diagnolAns=solve(triangle,rowIndex+1, colIndex+1);

        int finalAns=triangle.get(rowIndex).get(colIndex)+ Math.min(downAns, diagnolAns);
        return finalAns;
    }
    static void main() {
        /*
        Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
        Output: 11
        Explanation: The triangle looks like:
           2
          3 4
         6 5 7
        4 1 8 3
        The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
        */

        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        int rowIndex=0;
        int colIndex=0;
        int ans=solve(triangle, rowIndex, colIndex);
        System.out.println(ans);
    }
}
