// Approach 1 ==> Time Complexity ==> O(n) || Space Complexity ==> O(n)

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
    public ListNode middleNode(ListNode head) {
        ListNode[] list = new ListNode[100];
       /* int n=0;
        while(head!=null) {
            n++;
            head=head.next;
        }
        n=n/2+1;*/
        int i=0;
        while(head!=null){
            list[i++] = head;
            head=head.next;
        }
        return list[i/2];
    }
}

// Approach 2 ==> Two Pointer 
// Time Complexity ==> O(n) || Space Complexity ==> O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
      ListNode start=head,end=head;
        while(end!=null&&end.next!=null){
            start=start.next;
            end=end.next.next;
        }
        return start;
    }
}
