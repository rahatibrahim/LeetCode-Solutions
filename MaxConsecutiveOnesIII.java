public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, counter = 0, len = 0;

        while (end < nums.length) {
            if (nums[end] == 0) counter++;
            end++;

            while (counter > k) {
                if (nums[start] == 0) counter--;
                start++;
            }

            len = Math.max(len, end - start);
        }

        return len;
    }
}
