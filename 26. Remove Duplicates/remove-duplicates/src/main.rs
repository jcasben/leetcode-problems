use std::collections::HashSet;

fn main() {
    let case1 = &mut vec![1,1,2];
    let case2 = &mut vec![0,0,1,1,1,2,2,3,3,4];

    println!("{}", remove_duplicates(case1));
    println!("{:#?}", case1);

    println!("{}", remove_duplicates(case2));
    println!("{:#?}", case2);
}

pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
    let set: HashSet<i32> = nums.iter().cloned().collect();
    let k = set.len() as i32;
    let mut numbers: Vec<i32> = set.into_iter().collect();
    numbers.sort();

    for i in 0..numbers.len() {
        nums[i] = numbers[i];
    }

    k
}
