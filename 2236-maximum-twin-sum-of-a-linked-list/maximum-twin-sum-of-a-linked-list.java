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
    private ListNode reverse(ListNode head2){
        ListNode curr=head2, prev=null, next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    // just find the middle ele by slow fast and breake the secondHalf by reverse the secondHalf and run two pointer over both LL
    public int pairSum(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode SecondHalf = reverse(slow.next);
        slow.next=null;
        ListNode temp1 = head;
        ListNode temp2= SecondHalf;
        int maxSum=0;
        while(temp1!=null){
         maxSum=Math.max(maxSum,(temp1.val+temp2.val));
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return maxSum;
        
    }
}