public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(2,l3);
        ListNode l5 = new ListNode(1,l4);
        l1.next = l3;

        Solution solution = new Solution();
        System.out.println(solution.hasCycle(l5));
    }
}
