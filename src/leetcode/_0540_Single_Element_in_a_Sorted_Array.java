package leetcode;
/*
    540 - Single Element in a Sorted Array
    Topic: Binary Search
    Time: O(log n)
    Notes: Use index parity to detect broken pairing and shrink search to the side containing the single element. Noticing pattern from start of array, if index is even, duplicate is on right, if index is odd, duplicate is on left. Noticing where the pattern breaks gives us the answer.
*/
public class _0540_Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
