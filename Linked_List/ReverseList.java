package Complete_Linked_List;

class ReverseList extends Node {
    public ReverseList(int data) {
        super(data);
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next ;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        ReverseList reverseList = new ReverseList(0);
        head = reverseList.reverseList(head);
        head.print(head);
    }
}