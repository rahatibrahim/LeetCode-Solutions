import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res = "";
        for (int slow = 0; slow < strs[0].length(); slow++) {
            boolean isTrue = true;
            for (int fast = 0; fast < strs.length - 1; fast++) {
                if (strs[fast].charAt(slow) != strs[fast + 1].charAt(slow)) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                res += strs[0].charAt(slow);
            } else {
                break;
            }
        }
        return res;
    }
}