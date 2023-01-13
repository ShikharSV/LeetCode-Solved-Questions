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
        int carry=0,sum=0;
        ListNode sumList=new ListNode(0);
        ListNode temp=sumList;
        while(l1!=null && l2!=null){
            if(carry==1){
               sum=l1.val+l2.val+carry; 
                carry=0;
            }
            else{
                sum=l1.val+l2.val;
            }
            if(sum<10){
                temp.next=new ListNode(sum);
                temp=temp.next;
            }
            else{
                carry=1;
                temp.next=new ListNode(sum%10);
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            if(carry==1){
                sum=carry+l1.val;
                if(sum<10){
                    temp.next=new ListNode(l1.val+carry);
                    temp=temp.next;
                    carry=0;
                }
                
                else{
                    carry=1;
                    temp.next=new ListNode(sum%10);
                    temp=temp.next;
                }
            }
            else{
                temp.next=new ListNode(l1.val);
                temp=temp.next;
            }
            l1=l1.next;
        }
        while(l2!=null){
            if(carry==1){
                sum=carry+l2.val;
                
                if(sum<10){
                    temp.next=new ListNode(l2.val+carry);
                    temp=temp.next;
                    carry=0;
                }
                else{
                    carry=1;
                    temp.next=new ListNode(sum%10);
                    temp=temp.next;
                }
            }
            else{
                temp.next=new ListNode(l2.val);
                temp=temp.next;
            }
            l2=l2.next;
        }
        if(carry==1){
            temp.next=new ListNode(carry);
                temp=temp.next;
        }
        return sumList.next;
    }
}