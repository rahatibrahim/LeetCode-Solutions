/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start

// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
// @lc code=end
