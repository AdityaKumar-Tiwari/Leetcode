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
       ListNode slow=head, fast=head; //create 2 pointers fast and slow
       //traverse fast and next fast untill it reaches null
       while(fast!= null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;      //fast goes two steps while slow moves only one step
       }
       //reverse the linked list
       ListNode prev = null;    //make a prev pointer which is null
       while(slow!= null)
       {
        ListNode temp = slow.next;
        slow.next = prev;
        prev = slow;
        slow = temp;
       }
       //now palindrome logic
       while(prev!= null){
        if(head.val!= prev.val) return false;
        head = head.next;
        prev = prev.next;
       }
       return true;
    }
}