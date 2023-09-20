import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String romanNumber = "MMCCIX";

        HashMap <Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int conversion = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            if ((i < romanNumber.length() - 1) &&
                    (roman.get(romanNumber.charAt(i)) < roman.get(romanNumber.charAt(i+1)))) {
                conversion -= roman.get(romanNumber.charAt(i));
            } else {
                conversion += roman.get(romanNumber.charAt(i));
            }
        }
        System.out.println(conversion);
    }
}
