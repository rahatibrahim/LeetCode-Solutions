// 118. Pascal's Triangle Solution

import java.util.ArrayList;
import java.util.List;

public class TriangleOfPascal {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        //     1
        //    1 1
        //   1 2 1
        //  1 3 3 1
        // 1 4 6 4 1

        triangle.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> cur_row = new ArrayList<>();

            for (int j = 1; j <= i + 1; j++) {
                if (j == 1) {
                    cur_row.add(1);
                } else if (j == i + 1) {
                    cur_row.add(1);
                } else {
                    cur_row.add(prev_row.get(j-2) + prev_row.get(j - 1));
                }
            }
            triangle.add(cur_row);
        }
        
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> listoflist = new ArrayList<List<Integer>>();
        listoflist = generate(10);

        for (List<Integer> l : listoflist) {
            System.out.println(l);
        }
        //System.out.println(listoflist);
    }
}
