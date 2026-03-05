package leetcode;
/*
    739 - Daily Temperatures
    Topic: Monotonic Stack
    Time: O(n)
    Notes: Traverse from right; maintain decreasing stack to find next warmer day. Do following operations in the stack: Keep on popping the elements until you find a smaller element then peek element in stack. If stack is not empty then find the difference between current index and peek stack's element's index and update result. End with pushing the index of current index.
*/
import java.util.*;
public class _0739_Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}
