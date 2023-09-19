use std::collections::HashMap;

fn main() {
    let n: String = String::from("MCMXCIV");
    let n_chars = n.chars();
    let mut map: HashMap<char, i32> = HashMap::new();
    map.insert('I', 1);
    map.insert('V', 5);
    map.insert('X', 10);
    map.insert('L', 50);
    map.insert('C', 100);
    map.insert('D', 500);
    map.insert('M', 1000);

    let mut result: i32 = 0;
    let mut previous = '-';

    for c in n_chars.rev() {
       if map.get(&c) < map.get(&previous) {
           result -= map.get(&c).unwrap();
       } else {
           result += map.get(&c).unwrap();
           previous = c;
       }
    }
    println!("{result}");
}
