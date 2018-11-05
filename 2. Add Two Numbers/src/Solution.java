/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月5日
 */

public class Solution {

    public static void main(String[] args) {
        ListNode l1 = init(new int[] { 2, 4, 3 });
        ListNode l2 = init(new int[] { 5, 6, 4 });
        ListNode sum = addTwoNumbers(l1, l2);
        while (sum != null) {
            System.out.print(sum.val + " -> ");
            sum = sum.next;
        }
    }

    public static ListNode init(int[] nums) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            tail.next = node;
            tail = node;
        }
        return head.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null; // the first node
        ListNode tail = null; // the last node
        byte carryBit = 0;
        while (l1 != null || l2 != null || carryBit == 1) {
            int a = (l1 == null ? 0 : l1.val);
            int b = (l2 == null ? 0 : l2.val);
            int val = a + b + carryBit;
            if (val >= 10) {
                carryBit = 1;
                val -= 10;
            } else {
                carryBit = 0;
            }
            if (head == null) {
                head = new ListNode(val);
                tail = head;
            } else {
                ListNode temp = new ListNode(val);
                tail.next = temp;
                tail = temp;
            }
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
