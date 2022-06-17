public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int cur_subarray_sum = nums[0];
        int max_subarray_sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (cur_subarray_sum + nums[i] < nums[i]) {
                // If the sum of all the previous numbers plus the current number 
                // is less than the current number
                // then there is no point including the previous numbers in the sub array
                // so we change the current sub array sum to the current number which is bigger
                cur_subarray_sum = nums[i];
            } else {
                cur_subarray_sum += nums[i];
            }

            // checks all the sub arrays and stores the maximum one
            if (cur_subarray_sum > max_subarray_sum) {
                max_subarray_sum = cur_subarray_sum;
            }
        }

        return max_subarray_sum;
    }

    public static void main(String[] args) {
        System.out.println(MaximumSubarray.maxSubArray(new int[] { -2, 1, -3, 2, 4, -1, 2, 1, -5, 4 }));
    }
}
