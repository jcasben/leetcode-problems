import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,1,0};
        System.out.println(Main.solution(nums));
    }

    public static boolean solution(int [] nums) {
        char status = ' ';
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) continue;
            if ((nums [i - 1] < nums[i]) && (status != 'd')) {
                status = 'c';
                continue;
            }
            if ((nums [i - 1] > nums[i]) && (status != 'c')) {
                status = 'd';
                continue;
            }
            return false;
        }

        return true;
    }
}