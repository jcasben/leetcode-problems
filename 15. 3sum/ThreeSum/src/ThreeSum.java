import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    private static List<List<Integer>> sol = new ArrayList<>();
    public static void main(String[] args) {
        int [] nums = {0,1,1};

        for (int i = 0; i < nums.length; i++) {
            twoSum(nums, (nums[i] * -1), i);
        }
        removeEmpty(sol);
        System.out.println(sol);
    }

    public static void twoSum(int [] nums, int target, int index) {
        outerLoop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((j == i) || (i == index) || (j == index)) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(target * -1);
                    addToSol(tmp);
                    //return new int[]{i, j};
                }
            }
        }
    }

    public static void addToSol(ArrayList<Integer> tmp) {
        Collections.sort(tmp);
        if (!sol.contains(tmp)) {
            sol.add(tmp);
        }
    }

    public static void removeEmpty(List<List<Integer>> sol) {
        for (int i = 0; i < sol.size(); i++) {
            if (sol.get(i).isEmpty()) {
                sol.remove(i);
            }
        }
    }
}
