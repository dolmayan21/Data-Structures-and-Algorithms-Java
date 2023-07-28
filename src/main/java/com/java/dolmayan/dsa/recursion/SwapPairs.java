package com.java.dolmayan.dsa.recursion;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class SwapPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode listN = head;

        int temp = listN.val;
        listN.val = listN.next.val;
        listN.next.val = temp;

        swapPairs(listN.next.next);
        return listN;
    }

}
