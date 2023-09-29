fn main() {
    let nums: Vec<i32> = vec![1,3,5,6];
    let target: i32 = 5;
    let sol: i32 = solution(nums,target);
    println!("{sol}");
}

fn solution(nums: Vec<i32>, target: i32) -> i32 {
    for (i, x) in nums.clone().iter().enumerate() {
        if *x == target {
            return i as i32;
        }
    }

    if nums[0] > target {
        return 0;
    } else if nums[nums.len() - 1] < target {
        return nums.len() as i32;
    }

    for (i, x) in nums.iter().enumerate() {
        if ((i + 1) < nums.len()) && (*x < target) && (target < nums[i + 1]) {
            return (i + 1) as i32;
        }
    }

    return 0;
}
