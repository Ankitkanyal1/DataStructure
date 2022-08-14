// Approach 1 ==> Two Pointer Approach || Time Complexity ==> O(N)

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=new ListNode();
        node.next=head;
        ListNode slow=node;
        ListNode fast=node;
        while(true && n!=0){
            n--;fast=fast.next;
        }
        //for(int i=1; i <= n; i++)
           // fast = fast.next;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(slow==node)
            return head.next;
        slow.next=slow.next.next;
        return head;
    }
}

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

