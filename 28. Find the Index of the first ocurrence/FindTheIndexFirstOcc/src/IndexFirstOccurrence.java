public class IndexFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        int n;
        if (haystack.length() == needle.length()) {
            n = 1;
        } else {
            n = haystack.length() - needle.length() + 1;
        }

        for (int i = 0; i < n; i++) {
            String tmp = haystack.substring(i,needle.length() + i);
            if (needle.equals(tmp)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
