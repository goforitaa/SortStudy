import java.util.Arrays;

public class LinkedLIstReverser {


    public ListNode reverser(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode p = head.getNext();
        ListNode pre = head;
        ListNode next = p.next;
        pre.next=null;
        //ListNode q1 = null;
        //ListNode pir = null;
            while(p!=null){
               p.next=pre; //表头反转
                pre = p;
                p =next;
                if(p!=null){
                    next = p.next;
                }
            }
            head = pre;

       return head;


    }

  public static void main(String[] args){
        CreateList  create = new CreateList();
        ListNode head = create.createLinkedList(Arrays.asList(2,3,4,56,5,7));
     // ListNode head1 = create.createLinkedList(Arrays.asList(2));
      //ListNode head2= create.createLinkedList(Arrays.asList(5,7));
        create.printf(head);
        System.out.println();
      LinkedLIstReverser  resver = new LinkedLIstReverser();
      ListNode newhead = resver.reverser(head);
      System.out.println("翻转后.........");
      create.printf(newhead);

  }

}
