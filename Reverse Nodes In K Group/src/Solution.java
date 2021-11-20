class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)return head;

        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pre = fake;
        ListNode p = fake.next;
        int i = 0;

        while(p != null){
            i = i + 1;
            if(i % k == 0){
                pre = reverse(pre,p.next);
                p = pre.next;
            }else{
                p = p.next;
            }
        }
        traverse(fake.next);
        return fake.next;
    }

    public ListNode reverse(ListNode pre,ListNode next){
        ListNode last = pre.next;
        ListNode curr = last.next;

        while(curr!=next){
            last.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = last.next;
        }return last;
    }

    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
} 