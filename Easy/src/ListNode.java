public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Create a dummy node for us to merge the two linked list.
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;
        //use for moving the tail of the dummyNode to the next so that the node from the lists can be transferred into.

        //Compare the values of the linkedlist, if one is smaller than the other one, copy it to the dummy node and traverse the linked list that was affected. Iterate.
        while(true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            else if (list2 == null){
                tail.next = list1;
                break;
            }

            if (list1.val > list2.val) {
                tail.next = list2;
                list2 = list2.next;
            } // if list2's current value is smaller, move it to the dummyNode and traverse list 2.
            else {
                tail.next = list1;
                list1 = list1.next;
            } //else list1's value must be smaller, so copy the node to the dummyNode and traverse list 1.
            tail = tail.next;
        }
        dummyNode = dummyNode.next;
        return dummyNode;
    }
}