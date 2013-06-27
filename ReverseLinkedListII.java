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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m >= n || head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode safe = new ListNode(0);
        safe.next = head;
        ListNode prev = safe;
        int i = 1;
        while(i < m) {
            prev = prev.next;
            current = current.next;
            i++;
        }
        ListNode prevM = prev;
        ListNode M = current;
        while(i <= n) {
            prev = prev.next;
            current = current.next;
            i++;
        }
        ListNode afterN = current;
        prev.next = null;
        prevM.next = reverse(M);
        M.next = afterN;
        return safe.next;
        
    }
    
    public ListNode reverse(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode node = head.next;
        head.next = null;
        ListNode result = reverse(node);
        node.next = head;
        return result;
    }
}