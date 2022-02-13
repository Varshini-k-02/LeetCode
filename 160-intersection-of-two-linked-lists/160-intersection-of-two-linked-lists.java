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
        int n1=0,n2=0;
        ListNode temp=null;
        for(temp=headA;temp!=null;temp=temp.next){
            n1++;
        }
        for(temp=headB;temp!=null;temp=temp.next){
            n2++;
        }
        for(;n1>n2;n1-=1){
            headA=headA.next;
        }
        for(;n2>n1;n2-=1){
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        if(headA!=null){
            return headA;
        }
        return null;
    }
    
}
