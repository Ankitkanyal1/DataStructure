// Approach 1 ==> Time Complexity ==> O(MAX(N,M)) || Space Complexity ==> O(MAX(N,M))

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode node=new ListNode(0);
        ListNode curr=node;
        while(l1!=null || l2!=null || carry!=0){
            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return node.next;
    }
}

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

// Appraoch 2 ==> Using Recursion 

class Solution {
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1==null && l2==null && carry==0) return null;
        int x=l1!=null?l1.val:0;
        int y=l2!=null?l2.val:0;
        int sum=x+y+carry;
        carry=sum/10;
        l1=l1!=null?l1.next:null;
        if(l2!=null) l2=l2.next;
        ListNode node=new ListNode(sum%10,addTwoNumbers(l1,l2));
        return node;
    }
}
