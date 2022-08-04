public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            len = Math.max(len, count);
        }

        return len;
    }
}
