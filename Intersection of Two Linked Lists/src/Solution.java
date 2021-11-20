public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode headA1 = headA;
        while(headA1.next!=null){
            headA1 = headA1.next;
        }headA1.next = headB;

        ListNode start,slow,fast;
        fast = slow = headA;
        start = null;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                start = headA;
                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }break;
            }
        }
        headA1.next = null;
        assert start != null;
        System.out.println(start.val);
        return start;
    }
}