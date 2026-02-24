package leetcode;
/*
    3848 - Check Digitorial Permutation
    Topic: Math / Digit Manipulation
    Time: O(d)
    Notes: Compute factorial digit sum using an array storing permutation of all 9 digits and compare digit frequencies to verify permutation by creating frequency array and adding and subtracting the frequencies. Finally all values in frequency should be 0 for it to be true.
*/
public class _3848_Check_Digitorial_Permutation {
    public boolean isDigitorialPermutation(int n) {
        int temp = n, sum = 0;
        int[] factorial = {1,1,2,6,24,120,720,5040,40320,362880};
        if(n == 0) sum = 1;
        while(temp > 0){
            int digit = temp%10;
            sum += factorial[digit];
            temp /= 10;
        }
        return isPermutation(n, sum);
    }
    boolean isPermutation(int n, int sum){
        int[] freq = new int[10];
        int digit = 0;
        if(n == 0) freq[0]++;
        if(sum == 0) freq[0]--;
        while(n > 0){
            digit = n%10;
            freq[digit]++;
            n/=10;
        }
        while(sum > 0){
            digit = sum%10;
            freq[digit]--;
            sum/=10;
        }
        for(int num : freq) if(num != 0) return false;
        return true;
    }
}
