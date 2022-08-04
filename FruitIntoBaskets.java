import java.util.HashMap;

public class FruitIntoBaskets {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, len = 0;

        while (end < fruits.length) {
            int a = fruits[end];
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.get(a) == 1) counter++;
            end++;

            while (counter > 2) {
                int temp = fruits[start];
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) counter--;
                start++;
            }

            len = Math.max(len, end - start);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] f = {6,6,6,5,6,6,6,1,1,1,1,1,1,1,1,6,6,6};
        System.out.println(totalFruit(f));
    }
}
