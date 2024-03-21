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
        ListNode curr = head, prev = null, temp;

        while(curr != null){
            temp =curr.next;  //in the temp variable store the current node values so that it did't lost 
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}