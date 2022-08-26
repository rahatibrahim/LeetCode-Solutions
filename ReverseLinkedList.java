public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        /*
        // Iterative way
        ListNode prev = null;
        ListNode curr = new ListNode();

        while (head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }

        return prev;
        */

        // recursive way
        if (head == null || head.next == null) {
            return head;
        }
        ListNode n = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return n;
    }
}
