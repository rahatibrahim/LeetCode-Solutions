public class MaximumAverageSubarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);
        }

        /*
        while (b_runner < nums.length) {
            for (int i = a_runner; i <= b_runner; i++) {
                currAvSum += nums[i];
            }
            currAvSum /= k;
            if (currAvSum > maxSum) {
                maxSum = currAvSum;
            }
            currAvSum = 0;
            a_runner++;
            b_runner++;
        }
        */

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
