class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sorted = new ListNode(0);
        ListNode head = sorted;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                sorted.next = l1;
                l1 = l1.next;
                sorted = sorted.next;
            }else{
                sorted.next = l2;
                l2 = l2.next;
                sorted = sorted.next;
            }
        }

        if(l1 != null){
            while(l1 != null){
                sorted.next = l1;
                l1 = l1.next;
                sorted = sorted.next;
            }
        }else{
            while(l2 != null){
                sorted.next = l2;
                l2 = l2.next;
                sorted = sorted.next;
            }
        }
        traverse(head.next);
        return head.next;
    }

    public void traverse(ListNode head){
        if(head == null)return;
        System.out.print(head.val + ",");
        traverse(head.next);
    }
}