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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
     ListNode temp=head.next, prev=head;
     while(temp!=null){
        if( prev.val==temp.val){
            temp=temp.next;
        }
        else{
        prev.next=temp;
        prev=temp;
        temp=temp.next;
        }

     } 
     // if we process all the node but still last node remain duplicate
     prev.next=temp;
     return head;  
    }
}