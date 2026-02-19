package leetcode;
/*
    451 - Sort Characters By Frequency
    Topic: HashMap / Sorting
    Time: O(n + k log k)
    Notes: Count character frequencies and sort distinct characters by descending frequency.
*/
import java.util.*;
public class _0451_Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> {
            return map.get(b) - map.get(a);
        });
        StringBuilder sb = new StringBuilder();
        for(Character ch : list){
            int count = map.get(ch);
            while(count > 0){
                sb.append(ch); count--;
            }
        }
        return sb.toString();
    }
}
