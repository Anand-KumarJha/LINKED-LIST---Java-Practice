public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(2,l2);
        ListNode l4 = new ListNode(7,l3);

        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(6,l5);
        ListNode l7 = new ListNode(5,l6);

        Solution solution = new Solution();
        solution.addTwoNumbers(l4,l7);
        System.out.println("----");
        FastSolution fastSolution = new FastSolution();
        fastSolution.addTwoNumbers(l4,l7);

    }
}
