package leetcode;
/*
    215 - Kth Largest Element in an Array
    Topic: Heap / Priority Queue
    Time: O(n log k)
    Notes: Maintain min heap of size k storing k largest elements; root gives kth largest.
*/
import java.util.*;
public class _0215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
