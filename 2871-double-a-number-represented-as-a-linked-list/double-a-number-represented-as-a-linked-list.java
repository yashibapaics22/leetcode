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
    public ListNode doubleIt(ListNode head) {
        Stack <Integer> st= new Stack<>();
        while(head!=null){
            st.push(head.val);
            head=head.next;
        }
        int carry=0;
        ListNode dummy=null;
        while(!st.isEmpty() || carry!=0){
            int total = carry;
            if (!st.isEmpty()) {
                total += st.pop() * 2;
            }
            carry=total/10;
            ListNode ll= new ListNode (total%10);
            ll.next=dummy;
            dummy=ll;
        }
        return dummy;
    }
}