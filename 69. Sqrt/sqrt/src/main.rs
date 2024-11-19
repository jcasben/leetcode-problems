fn main() {
    println!("{}", my_sqrt(2147395600))
}

pub fn my_sqrt(x: i32) -> i32 {
    if x == 0 || x == 1 {
       return x;
    }

    let mut i = 1;
    let mut sqrt: i64 = 1;

    while sqrt <= x as i64 {
        i += 1;
        sqrt = i * i;
    }

    (i - 1) as i32
}
