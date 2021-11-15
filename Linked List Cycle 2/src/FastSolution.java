public class FastSolution {
    //Floyd's Cycle Detection Algorithm

    public ListNode detectCycle(ListNode head) {
        ListNode fast,slow,start;
        start = null;
        fast = slow = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                start = head;

                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }break;
            }
        }
        if(start!=null)
        System.out.println(start.val);

        return start;
    }

}