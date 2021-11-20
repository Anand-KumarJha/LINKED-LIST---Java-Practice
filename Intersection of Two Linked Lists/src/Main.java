public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(2,l3);
        ListNode l5 = new ListNode(1,l4);

        ListNode l11 = new ListNode(9,l3);
        ListNode l12 = new ListNode(8,l11);
        ListNode l13 = new ListNode(7,l12);

        Solution solution = new Solution();
        solution.getIntersectionNode(l5,l13);
    }
}
