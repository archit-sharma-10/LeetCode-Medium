package leetcode;
/*
    7 - Reverse Integer
    Topic: Math / Simulation
    Time: O(n)
    Notes: Reverse digits using modulo/division and return 0 when overflow exceeds 32-bit range.
*/
public class _0007_Reverse_Integer {
    public int reverse(int x) {
        boolean flag = (x >= 0);
        x = Math.abs(x);
        long rev = 0;
        while(x > 0){
            int digit = x%10;
            rev = rev*10 + digit;
            x/=10;
            if(rev > Integer.MAX_VALUE) return 0;
        }
        if(!flag) rev = -rev;
        return (int)rev;
    }
}
