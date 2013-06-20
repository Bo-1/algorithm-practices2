public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode safeS = new ListNode(0);
        ListNode s = safeS;
        ListNode safeL = new ListNode(0);
        ListNode l = safeL;
        ListNode n = head;
        while(n != null) {
            if(n.val >= x) {
                l.next = n;
                l = l.next;
            }
            else {
                s.next = n;
                s = s.next;
            }
            n = n.next;
        }
        l.next = null;
        s.next = safeL.next;
        return safeS.next;
    }
}