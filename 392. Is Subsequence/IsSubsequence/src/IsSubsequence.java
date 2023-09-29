import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(IsSubsequence.solution("b", "c"));
    }

    public static boolean solution(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        Integer [] indexes = new Integer[s.length()];
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                indexes[j] = i;
                j++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if () {
                return false;
            }
        }
        return true;
    }
}
