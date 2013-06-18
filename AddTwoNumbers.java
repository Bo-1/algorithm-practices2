public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null && carry == 0)
            return null;
        int val = carry;
        if(l1 != null)
            val += l1.val;
        if(l2 != null)
            val += l2.val;
        int newCarry = 0;
        if(val >= 10) {
            val = val % 10;
            newCarry = 1;
        }
        ListNode node = new ListNode(val);
        node.next = addTwoNumbers(l1 == null?null:l1.next, l2 == null? null : l2.next, newCarry);
        return node;
    }
}
