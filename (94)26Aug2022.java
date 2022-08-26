// Approach 1 ==> Iterative approach || Time Complexity ==> O(N)

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
    public ListNode swapPairs(ListNode head) { // [1,2,3,4,5]
        if(head==null||head.next==null) return head;
        ListNode curr=head.next.next;
        ListNode prev=head;
        head=head.next;
        head.next=prev; // [2,1,3,4,5]
        while(curr!=null&&curr.next!=null){
            prev.next=curr.next;     
            prev=curr;  
            ListNode temp=curr.next.next;
            curr.next.next=curr;
            curr=temp;   // [2,1,4,3,5]
        }
        prev.next=curr;
        return head;
    }
}

//Input: head = [1,2,3,4]
//Output: [2,1,4,3]


// Approach 2 ==> Recursive approach 

class Solution {
    public ListNode swapPairs(ListNode head) { // [1,2,3,4,5]
        if(head==null||head.next==null) return head;
        ListNode curr=head.next;
        head.next=swapPairs(head.next.next);
        curr.next=head;
        return curr;
    }
}
