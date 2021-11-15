class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return null;
        ListNode last;
        ListNode prev = head;
        ListNode head1 = head;

        int size = 1;
        while(head1.next != null){size++;head1 = head1.next;}
        k = k % size;
        head1 = head;

        for(int i = 0; i < k; i++){
            while(head1.next != null){prev = head1;head1 = head1.next;}
            last = head1;

            last.next = head;
            head = last;
            prev.next = null;
        }
        traverse(head);
        return head;
    }
    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
}
