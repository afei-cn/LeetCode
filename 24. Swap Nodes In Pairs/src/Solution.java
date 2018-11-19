/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月19日
 */

public class Solution {

    public static void main(String[] args) {
        // create a list
        ListNode head = null;
        ListNode tail = null;
        for (int i = 1; i <= 20; i++) {
            ListNode node = new ListNode(i);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        // do swap
        head = swapPairs(head);
        // print list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        // init
        ListNode result = head.next;
        ListNode pair1 = head;
        ListNode pair2 = head.next;
        ListNode preview = null;
        // swap
        pair1.next = pair2.next;
        pair2.next = pair1;
        preview = pair1;
        pair1 = pair1.next;

        while (pair1 != null) {
            pair2 = pair1.next;
            if (pair2 == null) {
                break;
            }
            // swap
            preview.next = pair2;
            pair1.next = pair2.next;
            pair2.next = pair1;
            preview = pair1;
            pair1 = pair1.next;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
