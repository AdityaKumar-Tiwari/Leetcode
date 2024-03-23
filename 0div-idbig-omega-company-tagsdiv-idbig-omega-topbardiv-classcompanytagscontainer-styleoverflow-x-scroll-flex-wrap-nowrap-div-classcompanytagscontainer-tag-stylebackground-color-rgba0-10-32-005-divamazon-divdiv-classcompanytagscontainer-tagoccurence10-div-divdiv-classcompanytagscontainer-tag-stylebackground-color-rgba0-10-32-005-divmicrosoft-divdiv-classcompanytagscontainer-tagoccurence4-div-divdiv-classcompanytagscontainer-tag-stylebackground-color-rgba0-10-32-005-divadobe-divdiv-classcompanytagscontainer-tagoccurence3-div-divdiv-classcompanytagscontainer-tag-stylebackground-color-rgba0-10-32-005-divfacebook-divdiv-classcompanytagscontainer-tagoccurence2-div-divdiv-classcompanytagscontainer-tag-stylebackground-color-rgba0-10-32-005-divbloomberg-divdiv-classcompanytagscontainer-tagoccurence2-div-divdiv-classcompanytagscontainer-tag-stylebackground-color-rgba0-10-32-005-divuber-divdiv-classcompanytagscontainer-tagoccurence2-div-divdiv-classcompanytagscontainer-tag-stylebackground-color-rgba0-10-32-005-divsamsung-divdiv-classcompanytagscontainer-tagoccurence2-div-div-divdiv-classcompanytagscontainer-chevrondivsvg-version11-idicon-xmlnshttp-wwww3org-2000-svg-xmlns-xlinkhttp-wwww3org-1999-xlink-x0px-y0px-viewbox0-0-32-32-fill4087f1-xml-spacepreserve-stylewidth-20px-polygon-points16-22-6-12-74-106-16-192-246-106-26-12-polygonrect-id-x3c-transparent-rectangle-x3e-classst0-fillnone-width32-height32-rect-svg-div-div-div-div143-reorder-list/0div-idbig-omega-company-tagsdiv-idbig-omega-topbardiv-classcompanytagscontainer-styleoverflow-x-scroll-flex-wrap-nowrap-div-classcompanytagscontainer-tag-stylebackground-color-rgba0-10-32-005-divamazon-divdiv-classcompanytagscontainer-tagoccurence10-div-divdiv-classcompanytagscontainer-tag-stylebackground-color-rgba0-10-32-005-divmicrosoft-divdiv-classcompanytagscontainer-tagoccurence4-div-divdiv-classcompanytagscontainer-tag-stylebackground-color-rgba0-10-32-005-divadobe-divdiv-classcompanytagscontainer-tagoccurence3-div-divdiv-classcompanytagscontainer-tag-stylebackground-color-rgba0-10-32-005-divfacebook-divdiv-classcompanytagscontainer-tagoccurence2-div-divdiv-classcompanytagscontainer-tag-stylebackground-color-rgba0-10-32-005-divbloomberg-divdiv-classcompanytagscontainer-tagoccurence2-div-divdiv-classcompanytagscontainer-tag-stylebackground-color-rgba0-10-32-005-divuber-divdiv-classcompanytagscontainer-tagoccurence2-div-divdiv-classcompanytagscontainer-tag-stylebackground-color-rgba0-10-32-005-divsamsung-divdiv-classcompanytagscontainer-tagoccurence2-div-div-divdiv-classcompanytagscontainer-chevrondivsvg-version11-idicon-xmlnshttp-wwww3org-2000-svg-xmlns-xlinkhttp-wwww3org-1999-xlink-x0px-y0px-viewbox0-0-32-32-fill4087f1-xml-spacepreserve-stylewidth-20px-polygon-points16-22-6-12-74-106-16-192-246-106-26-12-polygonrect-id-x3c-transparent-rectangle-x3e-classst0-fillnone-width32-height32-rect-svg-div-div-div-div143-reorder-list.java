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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        //to find middle of the list
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;      //fast goes two steps while slow moves only one step
       }
       //reverse the second half of the  linked list
      ListNode prev = null,temp = null;
      while(slow!= null){
        temp = slow.next;
        slow.next = prev;
        prev = slow;
        slow = temp;
      }
      //merge the two halves of the lists
      ListNode l1 = head;
      ListNode l2 = prev; // prev now points to the head of the reversed second half
      while(l2.next != null){
        temp = l1.next;
        prev = l2.next;
        l1.next = l2;
        l2.next = temp;
        l1 = temp;
        l2 = prev;
      }
    }
}