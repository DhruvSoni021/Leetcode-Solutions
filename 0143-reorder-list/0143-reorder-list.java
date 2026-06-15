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
class Solution {
    public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next == null) return head;
        ListNode curr = head;
        ListNode fwd = null;
        ListNode pre = null;
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverseList(head2);

        ListNode i = head;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i!=null && j!=null)
        {
            k.next = i;
            k = k.next;
            i = i.next;

            k.next = j;
            k = k.next;
            j = j.next;
        }
        if(i==null) k.next = j;
        else k.next = i;

    }
}