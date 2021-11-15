class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,temp;
        if(head == null)return null;

        while(head.next != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }head.next = prev;

        traverse(head);
        return head;
    }
    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
}