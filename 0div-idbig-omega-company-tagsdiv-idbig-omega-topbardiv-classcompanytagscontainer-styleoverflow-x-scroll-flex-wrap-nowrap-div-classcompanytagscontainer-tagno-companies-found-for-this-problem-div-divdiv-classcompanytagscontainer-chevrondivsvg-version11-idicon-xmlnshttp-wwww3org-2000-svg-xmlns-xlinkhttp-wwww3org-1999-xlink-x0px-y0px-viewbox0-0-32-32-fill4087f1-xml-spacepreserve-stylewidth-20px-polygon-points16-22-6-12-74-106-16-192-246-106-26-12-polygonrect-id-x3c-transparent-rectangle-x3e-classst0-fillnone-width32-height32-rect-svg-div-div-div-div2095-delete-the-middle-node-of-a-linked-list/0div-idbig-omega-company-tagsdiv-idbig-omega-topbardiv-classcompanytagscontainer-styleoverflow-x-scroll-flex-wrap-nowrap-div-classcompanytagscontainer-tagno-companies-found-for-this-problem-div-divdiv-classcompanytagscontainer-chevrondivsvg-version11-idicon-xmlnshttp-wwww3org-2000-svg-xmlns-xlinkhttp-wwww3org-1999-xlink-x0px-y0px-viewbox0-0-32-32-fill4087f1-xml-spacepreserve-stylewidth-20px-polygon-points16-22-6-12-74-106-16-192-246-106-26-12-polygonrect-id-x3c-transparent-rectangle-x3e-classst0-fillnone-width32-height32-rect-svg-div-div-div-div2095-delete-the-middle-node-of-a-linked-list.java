class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow =head, fast = head;
        ListNode prev = null;
       //find middle of the ll
        while(fast!= null && fast.next!= null){
            prev = slow;  //firstly this moves and then slow goes ahead
            slow = slow.next;
            fast = fast.next.next; //fast goes two steps while slow moves only one step
       } 
       prev.next = prev.next.next;
       return head;
    }
}