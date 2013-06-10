/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null)
            return head;
        ListNode safeGuard = new ListNode(0);
        safeGuard.next = head;
        ListNode prev = safeGuard;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null && second.next!= null) {
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            first = first.next;
            second = first.next;
        }
        if(second != null && second.next == null) {
            prev.next = second;
            second.next = first;
            first.next = null;
        }
        return safeGuard.next;
    }
}
