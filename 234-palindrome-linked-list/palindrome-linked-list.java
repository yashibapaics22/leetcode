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
        ListNode start=head;
        Stack<Integer> st= new Stack<>();
        if(head==null || head.next==null){
            return true;
        }
        while(start!=null){
            st.add(start.val);
            start=start.next;
        }
        ListNode ll=head;
        while(!st.isEmpty()){
            if(st.pop()!=ll.val){
                return false;
            }
            ll=ll.next;
        }
        return true;
    }
}