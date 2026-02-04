package leetcode;
/*
    152 - Maximum Product Subarray
    Topic: Array / Greedy / Kadane's Algorithm
    Time: O(n)
    Notes: Run Kadane-style product scan from both ends to handle negative numbers and zeros. Check for max at every iteration and if product is 0, make it 1.
*/
public class _0152_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int max_prod = Integer.MIN_VALUE, product = 1;
        for(int i=0;i<nums.length;i++){
            product *= nums[i];
            max_prod = Math.max(max_prod, product);
            if(product == 0) product = 1;
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            product *= nums[i];
            max_prod = Math.max(max_prod, product);
            if(product == 0) product = 1;
        }
        return max_prod;
    }
}
