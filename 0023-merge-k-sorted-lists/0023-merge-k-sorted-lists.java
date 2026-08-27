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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int m = lists.length;
        for(int i=0;i<m;i++)
        {
            ListNode temp = lists[i];
            while(temp!=null)
            {
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head1 = null;
        while(pq.size()>0)
        {
            ListNode temp = new ListNode(pq.remove());
            temp.next = head1;
            head1 = temp;
        }
        return head1;
    }
}