import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{9})));
    }

    private static int[] plusOne(int[] digits) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            nums.add(digits[i]);
        }
        int i = 0;
        while (i < nums.size()) {
            if (nums.get(i) == 9) {
                nums.set(i, 0);
                if (i == digits.length - 1) nums.add(0);
            } else {
                nums.set(i, nums.get(i) + 1);
                break;
            }
            i++;
        }
        int [] sol = new int[nums.size()];
        int z = 0;
        for (int j = nums.size() - 1; j >= 0; j--) {
            sol[z++] = nums.get(j);
        }
        return sol;
    }
}
