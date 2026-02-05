package leetcode;
/*
    8 - String to Integer (atoi)
    Topic: String / Parsing / Validation
    Time: O(n)
    Notes: Scan string once, handle optional sign, accumulate digits and clamp on overflow. Create an index pointer, skip to first non null character, check the sign and store it, now keep on multiplying the digits and adding to a long variable. Check for overflows and return integer result.
*/
public class _0008_String_to_Integer_atoi {
    public int myAtoi(String s) {
        int idx = 0, n = s.length()-1;
        boolean positive = true;
        while(idx <= n && s.charAt(idx) == ' '){
            idx++;
        }
        if(idx <= n && (s.charAt(idx)=='+' || s.charAt(idx)=='-')){
            if(s.charAt(idx) == '-') positive = false;
            idx++;
        }
        long num = 0;
        while(idx <= n && Character.isDigit(s.charAt(idx))){
            num = num*10 + (s.charAt(idx) - '0');

            if(positive && num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(!positive && -num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            idx++;
        }
        if(!positive) return (int)(num * -1);
        return (int)num;
    }
}
