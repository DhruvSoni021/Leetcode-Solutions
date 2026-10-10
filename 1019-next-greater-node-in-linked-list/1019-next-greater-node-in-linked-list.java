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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return new int[]{};
        ArrayList<Integer> arr= new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[arr.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.size()-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek() <= arr.get(i)) {
                stack.pop();
            }

            if (stack.isEmpty())
                ans[i] = 0;
            else
                ans[i] = stack.peek();

            stack.push(arr.get(i));
        }
        return ans;
    }
}