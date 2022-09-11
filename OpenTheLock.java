import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OpenTheLock {
    public static int openLock(String[] deadends, String target) {
        HashSet<String> dead_ends = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        visited.add("0000");

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String lock_position = queue.poll();
                if (dead_ends.contains(lock_position)) {
                    continue;
                }

                if (lock_position.equals(target))
                    return level;

                StringBuilder sb = new StringBuilder(lock_position);
                for (int j = 0; j < lock_position.length(); j++) {
                    char curr_position = lock_position.charAt(j);
                    String s1 = sb.substring(0, j)
                            + (curr_position == '9' ? 0 : curr_position - '0' + 1)
                            + sb.substring(j + 1);
                    String s2 = sb.substring(0, j)
                            + (curr_position == '0' ? 9 : curr_position - '0' - 1)
                            + sb.substring(j + 1);

                    if (!visited.contains(s1) && !dead_ends.contains(s1)) {
                        queue.add(s1);
                        visited.add(s1);
                    }

                    if (!visited.contains(s2) && !dead_ends.contains(s2)) {
                        queue.add(s2);
                        visited.add(s2);
                    }
                }
            }

            level++;
        }

        return -1;
    }
}
