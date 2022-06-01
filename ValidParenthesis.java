import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else if (stack.isEmpty()) {
                return false;
            } else if (a == ')' && stack.pop() != '(') {
                return false;
            } else if (a == '}' && stack.pop() != '{') {
                return false;
            } else if (a == ']' && stack.pop() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis s = new ValidParenthesis();
        System.out.println(s.isValid("(())"));
    }
}
