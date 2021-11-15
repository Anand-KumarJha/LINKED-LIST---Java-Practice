class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prevNode = new ListNode(0);
        prevNode.next = head;
        ListNode newHead = prevNode;

        while(prevNode.next != null && prevNode.next.next != null){
            ListNode p1 = prevNode.next;
            ListNode p2 = p1.next;
            ListNode nextNode = p2.next;

            prevNode.next = p2;
            p2.next = p1;
            p1.next = nextNode;
            prevNode = p1;
        }
        traverse(newHead.next);
        return newHead.next;
    }
    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
}