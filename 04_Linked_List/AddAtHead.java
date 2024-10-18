package Complete_Linked_List;

class AddAtHead extends Node {
    public AddAtHead(int data) {
        super(data);
    }

    public static Node addAtHead(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtHead.addAtHead(head, 5);
        head.print(head);
    }
}

