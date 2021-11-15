class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)return null;
        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenhead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        traverse(head);
        return head;
    }

    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
}