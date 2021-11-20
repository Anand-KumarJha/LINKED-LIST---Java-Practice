import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode head1 = head;

        while(head1!=null){
            stack.push(head1.val);
            head1 = head1.next;
        }

        head1 = head;

        while(head1!=null){
            if(head1.val != stack.pop())return false;
            head1 = head1.next;
        }
        return true;
    }
}