class RecursiveSolution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }else if(head.next == null){
            return head;
        }else{
            ListNode next = head.next;
            head.next = null;

            ListNode rest = reverseList(next);
            next.next = head;
            return rest;
        }
    }
}