import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (k >= nums.length) k = nums.length - 1;
        
        for (int i = 0; i <= k; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);

            if (map.get(nums[i]) > 1) return true;
        }

        int begin = 0, end = k + 1;
        
        while (end < nums.length) {
            int count = map.getOrDefault(nums[end], 0);
            map.put(nums[end], count + 1);

            map.put(nums[begin], map.get(nums[begin]) - 1);

            if (map.get(nums[end]) > 1) return true;

            end++;
            begin++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] n = {2,3};
        System.out.println(containsNearbyDuplicate(n, 20));
    }
}
