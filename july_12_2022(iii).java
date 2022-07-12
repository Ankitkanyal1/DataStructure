// Time Complexity ==> O(n) & Space Complexity ==> O(1)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while(list1!=null &&list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next=list1!=null?list1:list2;
        return temp.next;
        
    }
}
