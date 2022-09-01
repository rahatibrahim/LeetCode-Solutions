import java.util.HashMap;

public class UniqueBinarySearchTrees {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n < 2) return 1;
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int left = i - 1;
            int right = n - i;
            int leftComb, rightComb;

            if (map.containsKey(left)) {
                leftComb = map.get(left);
            } else {
                leftComb = numTrees(left);
                map.put(left, leftComb);
            }

            if (map.containsKey(right)) {
                rightComb = map.get(right);
            } else {
                rightComb = numTrees(right);
                map.put(right, rightComb);
            }

            total += leftComb * numTrees(right);
        }

        return total;
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees t = new UniqueBinarySearchTrees();
        System.out.println(t.numTrees(4));
    }
}
