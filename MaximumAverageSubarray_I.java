public class MaximumAverageSubarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvSum = 0;
        double currAvSum = 0;
        double sum = 0;

        int a_runner = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvSum = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[a_runner];
            sum += nums[i];

            currAvSum = sum / k;
            if (currAvSum > maxAvSum) {
                maxAvSum = currAvSum;
            }
            currAvSum = 0;
            a_runner++;
        }

        /*
        while (b_runner < nums.length) {
            for (int i = a_runner; i <= b_runner; i++) {
                currAvSum += nums[i];
            }
            currAvSum /= k;
            if (currAvSum > maxAvSum) {
                maxAvSum = currAvSum;
            }
            currAvSum = 0;
            a_runner++;
            b_runner++;
        }
        */

        return maxAvSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
