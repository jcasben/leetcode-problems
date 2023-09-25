import java.util.HashMap;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        if (map.containsKey(target)) {
            System.out.println(map.get(target));
        } else {
            if (nums[0] > target) {
                System.out.println(0);
                return;
            } else if (nums[nums.length - 1] < target) {
                System.out.println(nums.length - 1);
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                 if (((i + 1) <= nums.length - 1) && nums[i] < target && target < nums[i + 1]) {
                     System.out.println(i + 1);
                     break;
                 }
            }
        }
    }
}
