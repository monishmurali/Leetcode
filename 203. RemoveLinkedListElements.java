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
    public ListNode removeElements(ListNode head, int target) {
        //create boss node and link boss.next to head to traverse through linked list
        // ListNode Boss=new ListNode();
        // take curr as head and prev as boss
        //if curr == value then link prev next to curr next which deletes curr
        //do prev=pre.next

        ListNode Boss=new ListNode();
        Boss.next=head;
        ListNode curr=head;
        ListNode prev=Boss;

        while(curr!=null)
        {
            if(curr.val==target)
            {
                prev.next=curr.next;
            }
            else
            {
                prev=prev.next;
            }
            curr=curr.next;
        }
        return Boss.next;

        
        
    }
}
