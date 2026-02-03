package leetcode;
/*
    287. Find the Duplicate Number

    Constraints: Cant create new Data Structure and cant modify the given array. Need to solve with
    constant external space.

    - Approach involves detecting the cycle in the given integer array.
    - Hare and tortoise approach: Fast and slow pointers to detect cycle.
    - CYCLE DETECTION WITH DO-WHILE
    - After finding the intersection point, starting the slow pointer again from start and moving it one
    step at a time, same with fast pointer till (slow != fast).
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
