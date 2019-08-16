import java.util.List;

/**
 * 先一般后特殊
 */
public class CreateList {

    public ListNode createLinkedList(List<Integer> list){
        if(list.size()==0){
            return null;
        }

        ListNode  head = new ListNode(list.get(0));
        if(list.size()==1){
            return head;
        }

        ListNode  subhead = createLinkedList(list.subList(1,list.size()));
        head.setNext(subhead);
         return head;

    }
    public void printf(ListNode node){
        while(node!=null){
            System.out.print(node.getVal()+" ");
            node=node.next;
        }

    }

}
