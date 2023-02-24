/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //this is called tortoise-rabbit problem
 //first fast pointer sent with 2X speed and slow pointer with 1X speed and if they meet cycle is detected and from there slow is initialized to starting and fast is at same place and then move by 1 step to determine the position where cycle met.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                break;
            }
        }
        if(fast==null || fast.next==null)
        {
            return null;
        }
        while(fast!=head)
        {
            fast=fast.next;
            head=head.next;
        }
        return head;
        
        
    }
}
