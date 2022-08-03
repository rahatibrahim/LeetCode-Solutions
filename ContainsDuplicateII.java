import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (k >= nums.length) k = nums.length - 1;
        
        for (int i = 0; i <= k; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

            if (map.get(nums[i]) > 1) return true;
        }


        int begin = 0, end = k + 1;
        
        while (end < nums.length) {
            if (map.get(nums[end]) == null) {
                map.put(nums[end], 1);
            } else {
                map.put(nums[end], map.get(nums[end]) + 1);
            }

            map.put(nums[begin], map.get(nums[begin]) - 1);

            if (map.get(nums[end]) > 1) return true;

            end++;
            begin++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] n = {2,2};
        System.out.println(containsNearbyDuplicate(n, 20));
    }
}
