import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        ListNode p = head;
        int index = 0;
        while( p != null){

            if(set.contains(p)){
                return p;
            }else{
                set.add(p);
            }

            p=p.next;
            index++;
        }

        return null;

    }
}