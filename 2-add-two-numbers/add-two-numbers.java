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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode ll= new ListNode();
      ListNode dummy=ll;
      sum(ll,l1,l2);  
      return dummy.next;
    }
    public static void sum(ListNode ll,ListNode l1,ListNode l2){
        int carry=0;
        int total=0;
      while(l1!=null || l2!=null ||carry!=0){
        total=carry;
        if (l1!=null){
            total=total+l1.val;
            l1=l1.next;
        }
        if (l2!=null){
            total=total+l2.val;
            l2=l2.next;
        }
        int num=total%10;
        carry=total/10;
        ll.next=new ListNode(num);
        ll=ll.next;
      }
    }
}