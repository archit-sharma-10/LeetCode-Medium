package leetcode;
/*
    442 - Find All Duplicates in an Array
    Topic: Array / In-place Marking
    Time: O(n)
    Notes: Use index as hash by negating visited positions to detect duplicates.
*/
import java.util.*;
public class _0442_Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            if(nums[Math.abs(num)-1] < 0){ result.add(Math.abs(num)); }
            else{nums[Math.abs(num)-1] = -nums[Math.abs(num)-1];}
        }
        return result;
    }
}
