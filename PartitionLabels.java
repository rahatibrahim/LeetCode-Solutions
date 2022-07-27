import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        boolean flag = false;
        char currChar = s.charAt(0);
        int startOfPartition = s.indexOf(currChar);
        int endOfPartition = s.lastIndexOf(currChar);

        while(!flag) {

            for(int i = startOfPartition + 1; i < endOfPartition; i++) {
                char ch = s.charAt(i);
                if (s.lastIndexOf(ch) > endOfPartition) {
                    endOfPartition = s.lastIndexOf(ch);
                }

                if (endOfPartition == s.length() - 1) {
                    break;
                }
            }

            if (endOfPartition == s.length() - 1) {
                res.add(endOfPartition - startOfPartition + 1);
                flag = true;
            } else {
                res.add(endOfPartition - startOfPartition + 1);
                startOfPartition = endOfPartition + 1;
                currChar = s.charAt(startOfPartition);
                endOfPartition = s.lastIndexOf(currChar);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res = partitionLabels("abcabdefghid");

        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
