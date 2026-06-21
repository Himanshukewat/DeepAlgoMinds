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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode preb = null;
        while( curr != null ){
            ListNode next = curr.next;
            curr.next = preb;
            preb = curr;
            curr = next; 
        }
        return preb;
    }
}
