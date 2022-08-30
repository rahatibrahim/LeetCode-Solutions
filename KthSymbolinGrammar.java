public class KthSymbolinGrammar {
    public int kthGrammar(int n, int k) {
        return recursion(n, k - 1);
    }

    public static int recursion(int n, int k) {
        if (n == 1) return 0;
        int a = recursion(n - 1, k / 2);
            
        if (a == 0) {
            if (k % 2 == 0) a = 0;
            else a = 1;
        } else {
            if (k % 2 == 0) a = 1;
            else a = 0;
        }
        
        return a;
    }
}
