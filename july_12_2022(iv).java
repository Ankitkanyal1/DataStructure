// Time Complexity ==> O(n)
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while(head!=null && head.val==val){
                head=head.next;
        }
        if(head==null) {
            return head;
        }
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
      return head;
    }
}
