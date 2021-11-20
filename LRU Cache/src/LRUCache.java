import java.util.HashMap;

class LRUCache {
    private class Node{
        Node prev;
        Node next;
        int key;
        int value;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    HashMap<Integer,Node> hashmap = new HashMap<>();
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int capacity,limit = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        tail.prev = head;
        head.next = tail;
    }

    public int get(int key) {
        if(!hashmap.containsKey(key)){
            return -1;
        }
        Node current = hashmap.get(key);
        current.prev.next = current.next;
        current.next.prev = current.prev;
        moveToTail(current);
        return hashmap.get(key).value;
    }

    public void put(int key, int value) {
        if(get(key) != -1){
            hashmap.get(key).value = value;
            return;
        }
        if(hashmap.size() == capacity){
            hashmap.remove(head.next.key);
            head.next = head.next.next;
            head.next.prev = head;
        }

        Node insert = new Node(key,value);
        hashmap.put(key,insert);
        moveToTail(insert);
    }

    private void moveToTail(Node current) {
        current.prev = tail.prev;
        tail.prev = current;
        current.prev.next = current;
        current.next = tail;
    }
}