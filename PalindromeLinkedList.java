import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode dup = head;
        while (dup != null) {
            stack.push(dup.val);
            dup = dup.next;
        }

        while (head != null) {
            if (head.val != stack.pop())
                return false;
            head = head.next;
        }

        return true;
    }
}
