use std::collections::HashSet;

fn main() {
    let case = vec![4, 4, 4];
    println!("{}", maximum_subarray_sum(case, 3));
}

pub fn maximum_subarray_sum(nums: Vec<i32>, k: i32) -> i64 {
    let mut i: usize = 0;
    let mut j: usize = k as usize - 1;
    let mut sum: i64 = 0;

    while j < nums.len() {
        let subarray = nums[i..j + 1].to_vec();
        let length_sub = subarray.len();
        let sub_set: HashSet<i32> = subarray.iter().cloned().collect();
        if length_sub != sub_set.len() {
            i += 1;
            j += 1;
            continue;
        }
        let mut tmp_sum: i64 = 0;
        for n in sub_set.into_iter() {
            tmp_sum += n as i64
        }
        if tmp_sum > sum { sum = tmp_sum; }

        i += 1;
        j += 1;
    }

    sum
}
