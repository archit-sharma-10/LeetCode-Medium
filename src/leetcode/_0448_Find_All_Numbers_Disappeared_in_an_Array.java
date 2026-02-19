package leetcode;
/*
    448 - Find All Numbers Disappeared in an Array
    Topic: Array / In-place Marking
    Time: O(n)
    Notes: Mark visited indices by negating values and collect indices that remain positive.
*/
import java.util.*;
public class _0448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) continue;
            nums[index] = -nums[index];
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0) result.add(i+1);
        }
        return result;
    }
}
