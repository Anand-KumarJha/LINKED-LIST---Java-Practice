class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode head1 = head;
        while(head1!= null){
            count++;
            head1 = head1.next;
        }
        int count1 = 0;
        head1 = head;
        while(head1!= null){
            if(count1 == count/2){
                System.out.println(head1.val);
                return head1;
            }head1 = head1.next;
            count1++;
        }return null;
    }
}