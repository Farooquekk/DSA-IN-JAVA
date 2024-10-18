package Complete_Linked_List;

class InsertAtSecondLast extends Node {
    public InsertAtSecondLast(int data) {
        super(data);
    }

    public Node insertAtSecondLast(Node head, int target) {
        Node newNode = new Node(target);
        if (head == null) {
            head = newNode;
            return head;
        }
        if (head.next == null) {
            head.next = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        InsertAtSecondLast insertAtSecondLast = new InsertAtSecondLast(0);
        head = insertAtSecondLast.insertAtSecondLast(head, 25);
        head.print(head);
    }
}