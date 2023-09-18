public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 101;
        StringBuilder reversed = new StringBuilder(String.valueOf(x));

        if (reversed.reverse().toString().equals(String.valueOf(x))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
