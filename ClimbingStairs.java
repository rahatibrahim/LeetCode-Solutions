public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n < 3)
            return n;

        int prev_prev_stair = 1;
        int prev_stair = 2;
        int curr_stair = 0;

        for (int i = 3; i <= n; i++) {
            curr_stair = prev_prev_stair + prev_stair;
            prev_prev_stair = prev_stair;
            prev_stair = curr_stair;
        }

        return curr_stair;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }
}
