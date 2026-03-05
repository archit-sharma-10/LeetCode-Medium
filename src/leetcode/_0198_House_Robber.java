package leetcode;
/*
    198 - House Robber
    Topic: Dynamic Programming
    Time: O(n)
    Notes: dp[i] = max(dp[i-1], dp[i-2] + nums[i]) representing robbing or skipping the current house.
*/
import java.util.*;
public class _0198_House_Robber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
