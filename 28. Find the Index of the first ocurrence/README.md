# First the Index of the first occurrence

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if 
needle is not part of haystack.

### Example 1:

Input: ``haystack = "sadbutsad", needle = "sad"``

Output: 0

Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

### Example 2:

Input: ``haystack = "leetcode", needle = "leeto"``

Output: -1

Explanation: "leeto" did not occur in "leetcode", so we return -1.

### Constraints:

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.
***

## Results

The implementation of the solution got the following results:

### Java

- **Runtime:** 0 ms (better than 100% of LeetCode users)
- **Memory Usage:** 40,1 MB (better than 93.94% of LeetCode users)