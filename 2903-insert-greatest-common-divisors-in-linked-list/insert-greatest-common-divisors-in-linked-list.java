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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp1=head;
        ListNode dummy= new ListNode(0);
        ListNode current=dummy;
        while(temp1!=null && temp1.next!=null){
            ListNode temp2=temp1.next;
            current.next=new ListNode(temp1.val);
            current=current.next;
            int v=gcd(temp1.val,temp2.val);
            current.next=new ListNode(v);
            current=current.next;
            temp1=temp2;
        }
        if (temp1 != null) {
            current.next = new ListNode(temp1.val);
        }
        return dummy.next;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}