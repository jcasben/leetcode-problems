fn main() {
    println!("{}", str_str("sdbutsad".to_owned(), "sad".to_owned()));
}

pub fn str_str(haystack: String, needle: String) -> i32 {
    haystack.find(&needle).map(|i| i as i32).unwrap_or(-1)
}