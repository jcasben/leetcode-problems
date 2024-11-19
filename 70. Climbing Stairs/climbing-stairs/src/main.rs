fn main() {
    climbing_stairs(10);
}

pub fn climbing_stairs(n: i32) -> i32 {
    let mut i = 0;
    let mut a = 1;
    let mut b = 0;

    while i < n {
        let tmp = a + b;
        b = a;
        a = tmp;
        i += 1;
    }

    a
}
