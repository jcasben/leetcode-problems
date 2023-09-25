import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {-3,-1,0,0,0,3,3};
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        nums = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i = 0; i < set.size(); i++) {
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
