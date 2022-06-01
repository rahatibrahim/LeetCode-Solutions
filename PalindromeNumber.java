/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Palindrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

public class PalindromeNumber {
    public static void main(String[] args) {
        Palindrome n = new Palindrome();
        System.out.println(n.isPalindrome(1231));
    }
}