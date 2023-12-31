# 2. Two Sum problem

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 

### Example 1:

Input: `nums = [2,7,11,15], target = 9`

Output: `[0,1]`

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

### Example 2:

Input: `nums = [3,2,4], target = 6`

Output: `[1,2]`

### Example 3:

Input: `nums = [3,3], target = 6`

Output: `[0,1]`

### Constraints:

- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- `-109 <= target <= 109`
- Only one valid answer exists.


***
## Results

This implementation of the solution got the following results:

### Rust

- **Runtime:** 54 ms (better than 12.1% of LeetCode users)
- **Memory Usage:** 2.2 MB (better than 61.14% of LeetCode users)

### Java

- **Runtime:** 95 ms (better than 5.88% of LeetCode users)
- **Memory Usage:** 47.3 MB (better than 58.42% of LeetCode users)



