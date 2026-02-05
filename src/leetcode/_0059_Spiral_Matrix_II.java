package leetcode;
/*
    59 - Spiral Matrix II
    Topic: Matrix / Simulation
    Time: O(n^2)
    Notes: Fill matrix layer by layer while shrinking four directional boundaries. Top, bottom, left, right, 4 loops with shrinks and checks.
*/
public class _0059_Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1;
        int top = 0, bottom = n-1;
        while(left <= right && top <= bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = count++;
            }
            right--;
            if(top < bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }
            if(left < right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        return matrix;
    }
}
