// Approach 1 ==> Iterative Approach  
// Time Complexity ==> 0(n)

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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre= cur;
            cur=next;
        }
        head.next=null;
        head=pre;
      return head;  
    }
}

// Approach 2 ==> Recursive approach
// Time Complexity ==> 0(n)
