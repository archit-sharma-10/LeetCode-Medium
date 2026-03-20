package leetcode;
/*
    31 - Next Permutation
    Topic: Array / Greedy
    Time: O(n)
    Notes: Set index = -1. Find the index of first decreasing element from right side, now find the element just greater than this decreasing element from right side, swap these two values. Now reverse the array from index + 1 to n - 1.
*/
public class _0031_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int index = -1, n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index != -1){
            for(int i=n-1; i>0; i--){
                if(nums[index] < nums[i]){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        int left = index + 1, right = n-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++; right--;
        }
        return;
    }
}
