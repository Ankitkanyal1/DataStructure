// Approach 1 ==>Two Pointer || Time Complexity ==> O(N)

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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        System.out.println(prev.val+" "+slow.val);
        ListNode l1=head;
        System.out.println(head.val);
        ListNode l2=reverse(slow);
        System.out.println(l2.val);
        merge(l1,l2);
     
    }
    
    public ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static void merge(ListNode l1, ListNode l2){
        while(l2!=null){
            ListNode next=l1.next;
            l1.next=l2;
            l1=l2;
            l2=next;
        }
    }
}

Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3] 
