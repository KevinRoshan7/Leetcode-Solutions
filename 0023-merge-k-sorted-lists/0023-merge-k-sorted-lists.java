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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> x=new PriorityQueue<>();
        for(ListNode head: lists ){
            while(head!=null){
                x.offer(head.val);
                head=head.next;
            }
        }
        ListNode r=new ListNode(0);
        ListNode c=r;
        while(!x.isEmpty()){
            c.next=new ListNode(x.poll());;
            c=c.next;
        }
        return r.next;
    }
}