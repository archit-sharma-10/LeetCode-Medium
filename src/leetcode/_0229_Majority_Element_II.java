package leetcode;
/*
    229 - Majority Element II
    Topic: Array / Greedy
    Time: O(n)
    Notes: Track two candidates with counters. 5 if else statements to check the values and counts, then verify frequencies greater than n/3.
*/
import java.util.ArrayList;
import java.util.List;
public class _0229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = 0, num2 = 0, c1 = 0, c2 = 0;
        for(int num : nums){
            if(num == num1){
                c1++;
            }else if(num == num2){
                c2++;
            }else if(c1 == 0){
                num1 = num;
                c1 = 1;
            }else if(c2 == 0){
                num2 = num;
                c2 = 1;
            }else{
                c1--; c2--;
            }
        }
        c1 = 0; c2 = 0;
        for(int num : nums){
            if(num == num1){
                c1++;
            }else if(num == num2){
                c2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(c1 > nums.length/3) list.add(num1);
        if(c2 > nums.length/3) list.add(num2);
        return list;
    }
}
