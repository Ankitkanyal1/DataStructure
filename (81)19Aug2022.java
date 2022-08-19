// Approach 1 ==> Two Pointer || Time Complexity ==> O(N)

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)break;
        }
        System.out.println(slow.val+" "+fast.val);
        if(fast==null||fast.next==null) return null;
        fast=head;
        System.out.println(fast.val);
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        System.out.println(slow.val+" "+fast.val);
        }
        return slow;
        
    }
}

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
