package Complete_Linked_List;

class InsertAtMiddle extends Node {
    public InsertAtMiddle(int data) {
        super(data);
    }

    public Node insertAtMiddle(Node head, int d, int idx) {
        if (idx <= 0 || idx > size(head)) {
            System.out.println("Invalid");
            return null;
        }
        Node newNode = new Node(d);
        Node temp = head;
        int i = 1;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head = AddAtLast.addAtLast(head, 40);
        head = AddAtLast.addAtLast(head, 50);
        InsertAtMiddle insertAtMiddle = new InsertAtMiddle(0);
        head = insertAtMiddle.insertAtMiddle(head, 25, 3);
        head.print(head);
    }
}