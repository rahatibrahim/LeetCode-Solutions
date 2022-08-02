import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> table = new HashMap<>();

        // creating frequency table
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (table.get(c) == null) {
                table.put(c, 1);
            } else {
                table.put(c, table.get(c) + 1);
            }
        }

        int begin = 0, end = 0;
        int counter = table.size();
        int len = Integer.MAX_VALUE;
        String ans = "";
        int timer = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (table.containsKey(endChar)) {
                table.put(endChar, table.get(endChar) - 1);
                if (table.get(endChar) == 0) counter--;
            }

            end++;

            // if the counter hit 0 we can say that this substring has all the char from t
            while (counter == 0) {
                if (end - begin < len) {
                    len = end - begin;
                    ans = s.substring(begin, end);
                }

                char beginChar = s.charAt(begin);

                if (table.containsKey(beginChar)) {
                    table.put(beginChar, table.get(beginChar) + 1);
                    if (table.get(beginChar) > 0) counter++;
                }

                begin++;
                timer++;
            }
        }
        System.out.println("time it looped: " + timer);
        return ans;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        System.out.println("length of the string: " + s.length());
        System.out.println(minWindow(s, "ABC"));
    }
}
