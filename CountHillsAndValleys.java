public class CountHillsAndValleys {
    public static int countHillValley(int[] nums) {
        int total = 0;
        boolean up = false, down = false;

        for (int i = 0; i < nums.length - 1; i++) {
            int cur = nums[i];
            int next = nums[i + 1];

            if (next > cur) {
                up = true;
                if (down == true) {
                    total++;
                    down = false;
                }
            } else if (next < cur) {
                down = true;
                if (up == true) {
                    total++;
                    up = false;
                }
            }
        }

        return total;
    }
}
