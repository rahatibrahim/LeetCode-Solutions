public class SqrtX {
    public static int mySqrt(int x) {
        long low = 0, high = x;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if ((mid * mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return (int) low - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(20));
    }
}
