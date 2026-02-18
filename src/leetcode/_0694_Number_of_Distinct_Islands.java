package leetcode;
/*
    694 - Number of Distinct Islands
    Topic: DFS / Hashing
    Time: O(m * n)
    Notes: Encode island shape using DFS traversal path signature and store unique patterns in a set.
*/
import java.util.*;
public class _0694_Number_of_Distinct_Islands {
    int countDistinctIslands(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        Set<String> set = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    String path = compute(grid, i, j, m, n, "X");
                    set.add(path);
                }
            }
        }
        return set.size();
    }
    String compute(int[][] grid, int i, int j, int m, int n, String dir){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return "O";
        grid[i][j] = 0;
        String left = compute(grid, i, j-1, m, n, "L");
        String up = compute(grid, i-1, j, m, n, "U");
        String right = compute(grid, i, j+1, m, n, "R");
        String down = compute(grid, i+1, j, m, n, "D");
        return dir + left + up + right + down;
    }
}
