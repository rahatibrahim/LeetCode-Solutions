import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> q = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    q.push('(');
                    break;
                case '{':
                    q.push('{');
                    break;
                case '[':
                    q.push('[');
                    break;
                case ')':
                    if (q.empty() || q.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (q.empty() || q.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (q.empty() || q.pop() != '[')
                        return false;
                    break;
            }
        }

        if (q.empty()) {
            return true;
        }
        return false;
    }
}
