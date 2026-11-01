/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // just copy the next val in curr and break the connection
        node.val=node.next.val;
        node.next=node.next.next;
    }
}