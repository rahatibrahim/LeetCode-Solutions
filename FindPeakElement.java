public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (mid == 0 && nums[mid + 1] < nums[mid]) return mid;

            if (nums[mid + 1] < nums[mid] && nums[mid - 1] < nums[mid])
                return mid;

            if (nums[mid + 1] > nums[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }
}
