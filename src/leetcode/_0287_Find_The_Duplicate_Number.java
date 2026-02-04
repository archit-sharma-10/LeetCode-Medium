package leetcode;
/*
    287 - Find the Duplicate Number
    Topic: Two Pointers / Cycle Detection
    Time: O(n)
    Notes: We cant create new Data Structures, only new variables can be created. Array cannot be modified. Used the hare and tortoise approach to detect the cycle first and then find the duplicate element.
 */
public class _0287_Find_The_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
