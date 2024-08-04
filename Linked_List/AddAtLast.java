package Complete_Linked_List;

class AddAtLast extends Node {
    public AddAtLast(int data) {
        super(data);
    }

    public static Node addAtLast(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = AddAtLast.addAtLast(head, 20);
        head = AddAtLast.addAtLast(head, 30);
        head.print(head);
    }
}