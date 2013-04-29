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
        if(head.next == null || m == n)
            return head;
        ListNode safeGuard = new ListNode(0);
        safeGuard.next = head;
        ListNode prevM = safeGuard;
        ListNode postN = safeGuard;
        for(int i = 0; i < m - 1; i++) {
            prevM = prevM.next;
        }
        ListNode M = prevM.next;
        for(int i = 0; i < n; i++) {
            postN = postN.next;
        }
        ListNode N = postN;
        postN = postN.next;
        N.next = null;
        reverseList(M);
        prevM.next = N;
        M.next = postN;
        return safeGuard.next;
    }
    
    public void reverseList(ListNode node) {
        if(node.next == null)
            return;
        ListNode secondNode = node.next;
        node.next = null;
        reverseList(secondNode);
        secondNode.next = node;
    }


}

