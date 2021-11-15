import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        ListNode l3 = l1;
        ListNode l4 = l2;

        while(l3.next != null){
            stack.add(l3.val);
            l3 = l3.next;
        }stack.add(l3.val);

        while(l4.next != null){
            stack1.add(l4.val);
            l4 = l4.next;
        }stack1.add(l4.val);

        List<Integer> list = new ArrayList<>();
        int carry = 0;
        while(!stack.isEmpty() && !stack1.isEmpty()){
            int n1 = stack.pop();
            int n2 = stack1.pop();
            list.add(((n1 + n2 + carry)%10));

            if(n1 + n2 + carry > 9){
                carry = 1;
            }else{
                carry = 0;
            }
        }


        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                int n1 = stack.pop();
                list.add((n1 + carry)%10);

                if(n1 + carry > 9){
                    carry = 1;
                }else{
                    carry = 0;
                }
            }
        }else{
            while(!stack1.isEmpty()){
                int n1 = stack1.pop();
                list.add((n1 + carry)%10);

                if(n1 + carry > 9){
                    carry = 1;
                }else{
                    carry = 0;
                }
            }
        }

        if(carry == 1){
            list.add(1);
        }

        ListNode result = new ListNode();
        ListNode result1 = null;
        for (Integer integer : list) {
            result = new ListNode(integer, result1);
            result1 = result;
        }

        traverse(result);
        return result;
    }

    public void traverse(ListNode head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }

}