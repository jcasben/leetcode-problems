import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(IsSubsequence.solution("b", "abc"));
    }

    public static boolean solution(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        Integer [] indexes = new Integer[s.length()];
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                indexes[j] = i;
                if (j < s.length() - 1) {
                    j++;
                }
            }
        }

        for (Integer index : indexes) {
            if (index == null) return false;
        }

        for (int i = 1; i < s.length(); i++) {
            if (indexes[i] <= indexes[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
