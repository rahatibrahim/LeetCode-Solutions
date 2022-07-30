public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode runnerA = headA;
        ListNode runnerB = headB;

        while (runnerA != runnerB) {
            if (runnerA == null) {
                runnerA = headB;
            } else {
                runnerA = runnerA.next;
            }

            if (runnerB == null) {
                runnerB = headA;
            } else {
                runnerB = runnerB.next;
            }
        }

        return runnerA;
    }
}
