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
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode fwd = null;
        ListNode pre = null;

        while(curr!=null)
        {
            fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
    public int pairSum(ListNode head) {
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

        int maxSum = 0;
        int currSum =0;
        while(j!=null)
        {   
            currSum = i.val + j.val;
            i = i.next;
            j = j.next;

            if(maxSum < currSum) maxSum = currSum;
        }
        return maxSum;
    }
}