// 21. Merge Two Sorted Lists

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode headNode = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedList.next = list1;
                mergedList = mergedList.next;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                mergedList = mergedList.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            mergedList.next = list1;
        } else if (list2 != null) {
            mergedList.next = list2;
        }

        return headNode.next;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        list1.next.next.next = new ListNode(7);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        list2.next.next.next = new ListNode(6);

        ListNode res = mergeTwoLists(list1, list2);

        while (res != null) {
            System.out.println("Node: " + res.val);
            res = res.next;
        }
    }
}
