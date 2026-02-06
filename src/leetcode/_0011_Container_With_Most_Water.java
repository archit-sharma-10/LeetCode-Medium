package leetcode;
/*
    11 - Container With Most Water
    Topic: Two Pointers / Greedy
    Time: O(n)
    Notes: Move the smaller height inward while tracking maximum area formed by two lines.
*/
public class _0011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0, right = height.length-1;
        while(left < right){
            int width = right-left;
            int length = Math.min(height[left], height[right]);
            area = Math.max(area, length*width);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
