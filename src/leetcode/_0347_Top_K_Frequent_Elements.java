package leetcode;
/*
    347 - Top K Frequent Elements
    Topic: HashMap / Sorting
    Time: O(n + k log k)
    Notes: Count frequencies, sort distinct elements by descending frequency using custom comparator and pick top k.
*/
import java.util.*;
public class _0347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer> unique = new ArrayList<>(map.keySet());
        Collections.sort(unique, (a,b) -> {
            return map.get(b).compareTo(map.get(a));
        });
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = unique.get(i);
        }
        return result;
    }
}
