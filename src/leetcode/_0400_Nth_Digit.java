package leetcode;
/*
    400 - Nth Digit
    Topic: Math / Digit Manipulation
    Time: O(log n)
    Notes: Use a while loop to reach the desired block for desired digit using digit count, start (1) and end(9) incrementing all throughout loop till reached. Then addition of (n-1)/digitCount to the start and then finding (int)((n-1)%digitCount) index in the start number.
*/
public class _0400_Nth_Digit {
    public int findNthDigit(int n) {
        int digitCount = 1;
        int start = 1;
        int end = 9;
        while(n > (long)digitCount * end){
            n -= digitCount * end;
            digitCount++;
            start *= 10;
            end *= 10;
        }
        start += (n-1)/digitCount;
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        int index = (int)((n-1)%digitCount);
        return (sb.charAt(index) - '0');
    }
}
