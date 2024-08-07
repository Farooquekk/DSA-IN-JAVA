package Complete_Linked_List;

class MergeTwoLists extends Node {
    public MergeTwoLists(int data) {
        super(data);
    }

    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        } else {
            temp.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node l1 = new Node(10);
        l1 = AddAtLast.addAtLast(l1, 20);
        l1 = AddAtLast.addAtLast(l1, 30);
        Node l2 = new Node(15);
        l2 = AddAtLast.addAtLast(l2, 25);
        l2 = AddAtLast.addAtLast(l2, 35);
        MergeTwoLists mergeTwoLists = new MergeTwoLists(0);
        Node mergedHead = mergeTwoLists.mergeTwoLists(l1, l2);
        mergedHead.print(mergedHead);
    }
}