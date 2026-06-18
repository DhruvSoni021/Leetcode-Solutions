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
    public ListNode removeNodes(ListNode head) {
         Stack<Integer> st = new Stack<>();

        ListNode temp = head;

        while (temp != null) {

            while (!st.isEmpty() && temp.val > st.peek()) {
                st.pop();
            }

            st.push(temp.val);
            temp = temp.next;
        }

        head = null;

        while (!st.isEmpty()) {
            ListNode node = new ListNode(st.pop());
            node.next = head;
            head = node;
        }

        return head;
    }
}