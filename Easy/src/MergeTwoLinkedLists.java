import java.util.List;

public class MergeTwoLinkedLists {
    public static void main(String[] args) {
        ListNode dummyList = new ListNode();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);

        dummyList.mergeTwoLists(list1,list2);
    }
}