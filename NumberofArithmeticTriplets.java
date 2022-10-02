public class NumberofArithmeticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        // for (int i = 1; i < nums.length; i++) {
        for (int i = 0; i < nums.length - 2; i++) {
            int count = 0, fp = i, lp = i;
            while (lp < nums.length) {
                if (nums[lp] - nums[fp] > diff) {
                    break;
                } else if (nums[lp] - nums[fp] < diff) {
                    lp++;
                } else {
                    fp = lp;
                    lp++;
                    count++;
                }

                if (count == 2) {
                    res++;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4,5,6,7,8,9 };
        System.out.println(arithmeticTriplets(nums, 2));
    }
}
