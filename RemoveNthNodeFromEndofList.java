public class RemoveNthNodeFromEndofList {
    // one pass (two pointer teqnique)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        for (int i = 0; i < n + 1; i++) {
            if (fast == null) return head.next;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
    
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        
        int nthLastNode = count - n;
        if (nthLastNode == 0) return head.next;
        
        ListNode head = head;
        for (int i = 1; i < nthLastNode; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        
        return head;
    }
    */
}
