import java.util.Arrays;

public class MergeLIst {


    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode temphead = new ListNode(0);
        ListNode  newlist = temphead;
        while(list1!=null && list2!=null){
            boolean p=false;
            int l = list1.getVal();
            int k= list2.getVal();
            if(l<k){
                temphead.next=list1;
                list1=list1.next;
            }else{
                temphead.next=list2;
                list2=list2.next;
            }
            temphead = temphead.next;
        }
        if(list1==null ){
            temphead.next=list2;
        }
        if(list2==null ){
            temphead.next = list1;
        }
        return newlist.next;

    }
    public static void main(String[] args){
        CreateList   create = new CreateList();
        ListNode head = create.createLinkedList(Arrays.asList(2,4,6,8));
        ListNode head2 = create.createLinkedList(Arrays.asList(1,3,5,7,9));
        MergeLIst  merge = new MergeLIst();
        ListNode  newlistv = merge.Merge(head,head2);
        create.printf(newlistv);

    }
}
