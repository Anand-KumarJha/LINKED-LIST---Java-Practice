public class Main {

    public static void main(String[] args) {
        Node l1 = new Node(5);
        Node l2 = new Node(4);
        l2.next = l1;
        Node l3 = new Node(3);
        l3.next = l2;
        Node l4 = new Node(2);
        l4.next = l3;
        Node l5 = new Node(1);
        l5.next = l4;

        l2.random = l4;
        l3.random = l2;
        l4.random = l5;
        l5.random = l3;

        Solution solution = new Solution();
        solution.copyRandomList(l5);
    }
}
