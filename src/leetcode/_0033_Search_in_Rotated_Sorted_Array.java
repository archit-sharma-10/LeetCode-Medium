package leetcode;
/*
    33 - Search in Rotated Sorted Array
    Topic: Binary Search / Array
    Time: O(log n)
    Notes: Find the pivot and then apply binary search on both halves for the target element.
*/
public class _0033_Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int pivot = nums.length - 1;
        int left = 0, right = nums.length - 1;
        if(nums[0] > nums[nums.length - 1]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i] > nums[i+1]){
                    pivot = i;
                    break;
                }
            }
        }
        if(target == nums[pivot]) return pivot;
        if(target <= nums[nums.length-1] && pivot != nums.length-1){
            left = pivot + 1; right = nums.length - 1;
            while(left <= right){
                int mid = left + (right-left)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }else{
            left = 0; right = pivot;
            while(left <= right){
                int mid = left + (right-left)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
