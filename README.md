# LeetCode Problems

## ✅ Solved Problems

| # | Title | Topic | Time | Notes |
|---|------|------|------|------|
| 7 | Reverse Integer | Math / Simulation | O(n) | Reverse digits using modulo/division and return 0 when overflow exceeds 32-bit range. |
| 8 | String to Integer atoi | String / Parsing / Validation | O(n) | Scan string once, handle optional sign, accumulate digits and clamp on overflow. Create an index pointer, skip to first non null character, check the sign and store it, now keep on multiplying the digits and adding to a long variable. Check for overflows and return integer result. |
| 11 | Container With Most Water | Two Pointers / Greedy | O(n) | Move the smaller height inward while tracking maximum area formed by two lines. |
| 33 | Search in Rotated Sorted Array | Binary Search / Array | O(log n) | Find the pivot and then apply binary search on both halves for the target element. |
| 54 | Spiral Matrix | Matrix / Simulation | O(m * n) | Maintain four boundaries and traverse layer by layer while shrinking inward. Top, bottom, left, right, 4 loops with shrinks and checks, |
| 59 | Spiral Matrix II | Matrix / Simulation | O(n^2) | Fill matrix layer by layer while shrinking four directional boundaries. Top, bottom, left, right, 4 loops with shrinks and checks. |
| 152 | Maximum Product Subarray | Array / Greedy / Kadane's Algorithm | O(n) | Run Kadane-style product scan from both ends to handle negative numbers and zeros. Check for max at every iteration and if product is 0, make it 1. |
| 229 | Majority Element II | Array / Greedy | O(n) | Track two candidates with counters. 5 if else statements to check the values and counts, then verify frequencies greater than n/3. |
| 287 | Find The Duplicate Number | Two Pointers / Cycle Detection | O(n) | We cant create new Data Structures, only new variables can be created. Array cannot be modified. Used the hare and tortoise approach to detect the cycle first and then find the duplicate element. |
| 442 | Find All Duplicates in an Array | Array / In-place Marking | O(n) | Use index as hash by negating visited positions to detect duplicates. |
| 540 | Single Element in a Sorted Array | Binary Search | O(log n) | Use index parity to detect broken pairing and shrink search to the side containing the single element. Noticing pattern from start of array, if index is even, duplicate is on right, if index is odd, duplicate is on left. Noticing where the pattern breaks gives us the answer. |
