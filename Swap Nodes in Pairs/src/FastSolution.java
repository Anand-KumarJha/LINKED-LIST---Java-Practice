class FastSolution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode p2 = head.next;
        ListNode p3 = p2.next;

        head.next = p3;
        p2.next = head;

        if(p3 != null){
            head.next = swapPairs(p3);
        }
        return p2;
    }
}