public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int l = 1, r = n;
        int row = 0;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int coins = mid * (mid + 1) / 2;
            
            if (coins > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
                row = mid;
            }
        }
        
        return row;
    }
}
