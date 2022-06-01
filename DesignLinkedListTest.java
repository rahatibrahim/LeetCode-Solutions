/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {

    public int size;
    private Node head, tail;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size)
            return -1;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node current = new Node(val);
        if (size == 0)
            head = tail = current;
        else {
            current.next = head;
            head = current;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node current = new Node(val);
        if (size == 0) {
            head = tail = current;
        } else {
            tail.next = current;
            tail = current;
            tail.next = null;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size)
            return;
        Node newnew = new Node(val);
        Node current = head;
        if (index == 0)
            addAtHead(val);
        else if (index == size)
            addAtTail(val);
        else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newnew.next = current.next;
            current.next = newnew;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size)
            return;
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (index == size - 1)
                tail = current;
        }
        size--;
    }
}

// @lc code=end
public class DesignLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        System.out.println(ll.size);
        ll.addAtHead(7);
    }
}