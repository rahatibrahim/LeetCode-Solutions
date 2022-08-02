import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 4);
        System.out.println(map.get('A'));
        System.out.println(map.get('B'));
    }

    public static long factorialTailRecursive(long n, long accum) {
        if (n == 0) {
            return accum;
        }
        return factorialTailRecursive(n - 1, n * accum);
    }
}
