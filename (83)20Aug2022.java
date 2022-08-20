// Approach 1 ==> Two Pointer || Time Complexity ==> O(N)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
           a=a!=null?a.next:headB;
           b=b!=null?b.next:headA;
           /* if(a==null) a=headB;
            else a=a.next;
            if(b==null) b=headA;
            else b=b.next;*/
        }
        return a;
    }
}

// Approach 2 ==> Time Complexity ==> O(N+M)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        ListNode a=headA;
        int l1=0;
        while(a!=null){
            l1++;
            a=a.next;
        }
        ListNode b=headB;
        int l2=0;
        while(b!=null){
            l2++;
            b=b.next;
        }
        int diff=Math.abs(l1-l2);
        a=headA;
        b=headB;
        if(l1>l2){
            while(diff-->0){
                a=a.next;
            }
        }
        else{
            while(diff-->0){
                b=b.next;
            }
        }
        while(a!=b){
            a=a.next;
            b=b.next;
            if(a==null||b==null) return null;
        }
        return a;
    }
}
