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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(lists == null || lists.size() == 0)
            return null;
        class myComparator implements Comparator<ListNode> {
            @Override
            public int compare(ListNode n1, ListNode n2) {
                if(n1.val < n2.val)
                    return -1;
                else if(n1.val == n2.val)
                    return 0;
                else
                    return 1;
            }
        }
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.size(), new myComparator());
        for(ListNode node : lists) {
            if(node != null)
                minHeap.add(node);
        }
        ListNode head = new ListNode(0);
        ListNode current = new ListNode(0);
        ListNode prev = head;
        while(!minHeap.isEmpty()) {
            current = minHeap.poll();
            prev.next = current;
            prev = current;
            if(current.next != null)
                minHeap.add(current.next); 
        }
        return head.next;
    }
}