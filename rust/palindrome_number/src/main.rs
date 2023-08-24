fn main() {
    let x: i32 = 121;
    
    let x_to_string: String = x.to_string();
    let palindrome: String = x_to_string.chars().rev().collect();

    if x_to_string == palindrome {
        println!("true");
    } else {
        println!("false");
    }
}
