# Number of Good Pairs

[Link to the exercise.](https://leetcode.com/problems/number-of-good-pairs/description/)

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

### Example 1:

Input: ``nums = [1,2,3,1,1,3]``

Output: 4

Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

### Example 2:

Input: ``nums = [1,1,1,1]``

Output: 6

Explanation: Each pair in the array are good.

### Example 3:

Input: ``nums = [1,2,3]``

Output: 0

### Constraints:

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

***

## Results

This implementation of the solution got the following results:

### Java

- **Runtime:** 2 ms (better than 75.06% of LeetCode users)
- **Memory Usage:** 39.78 MB (better than 56.62% of LeetCode users)

### C#

- **Runtime:** 81 ms (better than 40.06% of LeetCode users)
- **Memory Usage:** 38.23 MB (better than 27.66% of LeetCode users)
