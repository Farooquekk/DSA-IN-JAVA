package Complete_Linked_List;

class SortList extends Node {
    public SortList(int data) {
        super(data);
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return merge(left, right);
    }

    private Node getMid(Node head) {
        Node midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    private Node merge(Node l1, Node l2) {
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
        Node head = new Node(30);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 50);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 10);
        SortList sortList = new SortList(0);
        head = sortList.sortList(head);
        head.print(head);
    }
}
