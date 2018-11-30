/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月30日
 */

class Solution {
    
    public static void main(String[] args) {
        // 1. init linked list
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for (int i = 1; i < 5; i++) {
            ListNode node = new ListNode(i + 1);
            tail.next = node;
            tail = node;
        }
        // 2. reverse list
        head = reverseList(head);
        // 3. print result list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode after = null;
        while (head != null) {
            after = head.next;
            head.next = previous;
            previous = head;
            head = after;
        }
        return previous;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
