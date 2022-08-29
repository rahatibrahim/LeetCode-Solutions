import java.util.HashMap;

public class FibonacciNumber {
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int val = 0;

        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            val = fib(n - 1) + fib(n - 2);
            cache.put(n, val);
        }

        return val;
    }
}
