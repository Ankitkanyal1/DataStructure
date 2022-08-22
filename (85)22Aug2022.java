// Approach 1 ==> Two Pointer Approach || Time Complexity ==> O(N) || Space Complexity ==> O(1)

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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if (head.next==null) return true;
        ListNode mid=middle(head);
        ListNode last=reverse(mid);
        while(last!=null){
            if(head.val!=last.val) return false;
            last=last.next;
            head=head.next;
        }
        return true;
    }
    
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode mid){
        ListNode curr=mid;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

Input: head = [1,2,2,1]
Output: true
  
// Approach 2 ==> Using Stack || Time Complexity ==> O(N) || Space Complexity ==> O(N)
  
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if (head.next==null) return true;
        Stack<ListNode> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.add(curr);
            curr=curr.next;
        }
        curr=head;
        while(!st.isEmpty()&&curr!=null){
            ListNode temp=st.pop();
            if(temp.val!=curr.val) return false;
            curr=curr.next;
        }
        return true;
    }
}  
