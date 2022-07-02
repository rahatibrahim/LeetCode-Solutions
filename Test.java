
public class Test {
    public static void main(String[] args) {
        System.out.println(factorialTailRecursive(5, 1));
    }

    public static long factorialTailRecursive(long n, long accum) {
        if (n == 0) {
            return accum;
        }
        return factorialTailRecursive(n - 1, n * accum);
    }
}
