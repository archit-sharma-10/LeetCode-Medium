package leetcode;
/*
    740 - Delete and Earn
    Topic: Dynamic Programming / Array
    Time: O(n + maxVal)
    Notes: Convert to House Robber by creating a sum array with sum of all values on their indexes. Then applying the same formula of Math.max(dp[i-2] + sum[i], dp[i-1]). Returning the value at last index.
*/
public class _0740_Delete_and_Earn {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int[] sum = new int[max+1];
        for(int num : nums){
            sum[num] += num;
        }
        int[] dp = new int[max+1];
        dp[1] = sum[1];
        for(int i=2;i<=max;i++){
            dp[i] = Math.max(dp[i-2] + sum[i], dp[i-1]);
        }
        return dp[max];
    }
}
