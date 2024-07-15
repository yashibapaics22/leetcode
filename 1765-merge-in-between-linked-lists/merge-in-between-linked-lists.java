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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode curr=list1;
        ListNode dummy= new ListNode(0);
        dummy.next= list1;
        ListNode prevA= dummy;
        ListNode nextB= null;
        while (curr != null) {
            if (count == a - 1) {
                prevA = curr;
            }
            if (count == b) {
                nextB = curr.next;
                break;
            }
            curr = curr.next;
            count++;
        }
        prevA.next = list2;
        ListNode tailOfList2 = list2;
        while (tailOfList2.next != null) {
            tailOfList2 = tailOfList2.next;
        }
        tailOfList2.next = nextB;
        return dummy.next;
    }
}