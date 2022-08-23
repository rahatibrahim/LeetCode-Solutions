public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = new ListNode();

        while (head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }

        return prev;
    }
}
