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
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null)
        return true;
        Stack <Integer> st= new Stack<>();
        ListNode start= head;
        while(start!=null){
            st.add(start.val);
            start=start.next;
        }
        ListNode ll= head;
        while(!st.isEmpty()){
            int k=st.pop();
            if (ll.val!=k)
            return false;
            ll=ll.next;
        }
        return true;
    }
}