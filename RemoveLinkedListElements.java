public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = new ListNode();
        prev.next = head;
        head = prev;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }

        return head.next;
    }
}
