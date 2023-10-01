public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(ReverseWords.solutionReverseWords("God Ding"));
    }

    public static String solutionReverseWords(String s) {
        int index = 0;
        StringBuilder sol = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sol.append(new StringBuilder(s.substring(index, i)).reverse());
                sol.append(" ");
                index = i + 1;
            } else if (i == s.length() - 1) {
                sol.append(new StringBuilder(s.substring(index, i + 1)).reverse());
            }
        }
        return sol.toString();
    }
}