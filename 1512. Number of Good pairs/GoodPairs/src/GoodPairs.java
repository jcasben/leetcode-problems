public class GoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(GoodPairs.goodPairsSolution(nums));
    }

    public static int goodPairsSolution(int [] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) pairs++;
            }
        }

        return pairs;
    }
}
