fn main() {
    let nums: Vec<i32> = vec![3,3];

    let target = 6;

    let mut sol: Vec<i32> = Vec::new();

    for (index1, i) in nums.iter().enumerate() {
        for (index2, j) in nums.iter().enumerate() {
            if index1 == index2 {
                continue;
            }
            if i + j == target {
                sol.push(index1 as i32);
                sol.push(index2 as i32);
                println!("[{index1}, {index2}]");
                return;
                //return sol;
            }
        }
    }
    //return sol;
}
