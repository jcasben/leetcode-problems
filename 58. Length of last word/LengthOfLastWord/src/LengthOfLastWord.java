public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "hola        ";
        char prev = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char actual = s.charAt(i);
            if (actual != ' ' && prev == ' ') {
                count = 0;
                count++;
            } else if (actual != ' ') {
                count++;
            }
            prev = actual;
        }
        System.out.println(count);
    }
}
