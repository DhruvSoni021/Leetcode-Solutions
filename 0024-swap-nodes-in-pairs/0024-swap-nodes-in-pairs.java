class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode d = new ListNode(-1);
        ListNode pre = d;
        d.next = head;
        
        while(pre.next != null && pre.next.next != null)
        {
            ListNode first = pre.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            pre.next = second;

            pre = first;
        }
        return d.next;

    }
}