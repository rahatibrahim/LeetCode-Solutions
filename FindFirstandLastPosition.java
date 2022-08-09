public class FindFirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                int tempRight = mid;

                res[0] = mid;
                // loop to find the first target occurrence
                while (left <= tempRight) {
                    mid = left + (tempRight - left) / 2;
                    if (nums[mid] != target) {
                        left = mid + 1;
                    } else {
                        res[0] = mid;
                        tempRight = mid - 1;
                    }
                }
                
                res[1] = mid;
                // loop to find the second target occurrence
                while (left <= right) {
                    mid = left + (right - left) / 2;
                    if (nums[mid] != target) {
                        right = mid - 1;
                    } else {
                        res[1] = mid;
                        left = mid + 1;
                    }
                }
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] n = {8,8,8,8};
        System.out.println(searchRange(n, 8));
    }
}
