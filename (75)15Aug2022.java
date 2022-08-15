// Approach 1 ==> Time Complexity ==> O(N)

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%count;
        k=count-k;
        while(k>0){
            temp=temp.next;k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
