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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = slow;

        for(int i=1;i<=n;i++)
        {
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast!=null)
        {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;

        return head;




        // ListNode temp = head;
        // int size=0;
        // while(temp != null){
        //     temp = temp.next;
        //     size++;
        // }
        // temp = head;
        // if(head == null || head.next == null ) return null;
        // for(int i=1; i<size-n; i++)
        // {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;

        // return head;
    }
}