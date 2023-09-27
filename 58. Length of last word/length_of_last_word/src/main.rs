fn main() {
    let s: String = String::from("Hello World");
    let mut prev: char = ' ';
    let mut count: u8 = 0;

    for c in s.chars() {
        if c != ' ' && prev == ' ' {
            count = 0;
            count += 1;
        } else if c != ' ' {
            count += 1;
        }
        prev = c;
    }
    println!("{count}");
}
