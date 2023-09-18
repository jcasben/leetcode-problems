public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    System.out.println(i + ", " + j);
                    return;
                }
            }
        }
    }
}
