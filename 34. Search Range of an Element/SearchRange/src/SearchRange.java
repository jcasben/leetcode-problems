import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int [] nums = {};
        int target = 0;
        System.out.println(Arrays.toString(SearchRange.searchRangeSolution(nums, target)));
    }

    public static int[] searchRangeSolution(int [] nums, int target) {
        int [] sol = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if ((sol[0] == -1) && (nums[i] == target)) {
                sol[0] = i;
            } else if ((sol[0] != -1) && (nums[i] == target)) {
                sol[1] = i;
            }
        }
        if (sol[1] == -1) sol[1] = sol[0];
        return sol;
    }
}
