import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= rowIndex + 1; i++) {
            list.add(rowNumber(rowIndex + 1, i, map));
        }

        return list;
    }

    public int rowNumber(int i, int j, HashMap<String, Integer> map) {
        if (j == 1 || j == i) return 1;
        int number = 0;
        String key = i + "," + j;
        if (map.containsKey(key)) {
            number = map.get(key);
        } else {
            number = rowNumber(i - 1, j - 1, map) + rowNumber(i - 1, j, map);
            map.put(key, number);
        }

        return number;
    }
}
