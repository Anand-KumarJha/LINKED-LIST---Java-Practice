class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return head;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr.next.random = null;
            curr = temp;
        }

        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }curr = curr.next.next;
        }

        curr = head;
        Node copyHead = curr.next;
        while(curr!=null){
            Node temp = curr.next.next;
            Node copy = curr.next;
            curr.next = temp;
            if(temp != null){
                copy.next = temp.next;
            }curr = temp;
        }
        traverse(head);
        return copyHead;
    }
    public void traverse(Node head){
        if(head == null)return;
        System.out.println(head.val);
        traverse(head.next);
    }
}