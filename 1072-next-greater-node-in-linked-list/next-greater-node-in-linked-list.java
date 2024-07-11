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
        Stack<Integer> st= new Stack<>();
        List<Integer> ll= new ArrayList<>();
        ListNode current= head;
        while(current!=null){
            ll.add(current.val);
            current=current.next;
        }
        int [] arr= new int [ll.size()];
        for (int i=0;i<ll.size();i++){
            while(!st.isEmpty() && ll.get(i)>ll.get(st.peek())){
                arr[st.pop()]=ll.get(i);
            }
            st.push(i);
        }
        return arr;
    }
}