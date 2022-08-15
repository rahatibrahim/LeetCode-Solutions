import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0, 0, res, "", n);

        return res;
    }

    public void dfs(int open, int close, List<String> res, String s, int total) {
        // opening bracket < total
        // closing bracket < opening bracket
        // open bracket == close bracket == n;

        if (open == total && close == total) {
            res.add(s);
            return;
        }

        if (open < total) {
            dfs(open + 1, close, res, s + "(", total);
        }
        
        if (close < open) {
            dfs(open, close + 1, res, s + ")", total);
        }
    }
}
