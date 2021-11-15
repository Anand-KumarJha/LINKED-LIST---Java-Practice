public class Main {

    public static void main(String[] args) {
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(2,l3);
        ListNode l5 = new ListNode(1,l4);

        Solution solution = new Solution();
        solution.swapPairs(l5);
    }
}
