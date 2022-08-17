// Appraoch 1 ==> Time Complexity ==> O(N)

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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(1);
        ListNode sm=small;
        ListNode large=new ListNode(1);
        ListNode lg=large;
        while(head!=null){
            if(head.val<x){
                sm.next=head;
                sm=sm.next;
            }
            else{
                lg.next=head;
                lg=lg.next;
            }
            head=head.next;
        }
        lg.next=null;
        sm.next=large.next;
        return small.next;
    }
}

Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
