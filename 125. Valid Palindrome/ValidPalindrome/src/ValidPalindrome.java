public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindromeSolution("0P"));
    }

    public static boolean validPalindromeSolution(String s) {
        s = s.toLowerCase();
        StringBuilder s2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) s2.append(c);
        }
        return s2.toString().contentEquals(s2.reverse());
    }
}
