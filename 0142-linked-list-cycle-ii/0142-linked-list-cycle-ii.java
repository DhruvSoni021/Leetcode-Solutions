/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(fast == null || fast.next == null) return null;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                ListNode n = head;
                while(n != slow)
                {
                    n = n.next;
                    slow = slow.next;
                }
                return n;
            }
        }
        return null;
    }
}